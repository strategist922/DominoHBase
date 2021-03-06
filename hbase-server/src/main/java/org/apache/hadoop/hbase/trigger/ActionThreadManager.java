package org.apache.hadoop.hbase.trigger;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: daidong
 * Date: 13-3-2
 * Time: 下午10:30
 * To change this template use File | Settings | File Templates.
 */
public class ActionThreadManager implements Runnable{
  HashMap<HTrigger, ActionThread> actionThreads = null;
  HashMap<HTrigger, HTriggerStatus> Reports = null;
  private boolean registed = false;

  @Override
  public void run(){
    while (true){
      if (!this.registed){
        TriggerEventQueue.register(this);
        this.registed = true;
      }
      dispatch();
    }
  }
  public void dispatch(){
    HTriggerEvent hte = null;
    try {
      hte = TriggerEventQueue.poll();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    if (actionThreads.containsKey(hte)){
      dispatch((ActionThread) actionThreads.get(hte.getBelongTo()), hte);
    } else {
      ActionThread curThread = new ActionThread();
      actionThreads.put(hte.getBelongTo(), curThread);
      dispatch(curThread, hte);
    }
  }

  public void report(HTrigger ht, HTriggerStatus hts){
    Reports.put(ht, hts);
  }
  private void dispatch(ActionThread actionThread, HTriggerEvent hte) {
    actionThread.feed(hte);
  }

  public void restart(HTrigger t){
  }
  public void kill(HTrigger t){
  }
}
