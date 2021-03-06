// Autogenerated Jamon proxy
// /Users/daidong/Documents/workspace/Vanth/hbase-core-trunk/hbase-server/src/main/jamon/org/apache/hadoop/hbase/tmpl/master/BackupMasterListTmpl.jamon

package org.apache.hadoop.hbase.tmpl.master;

// 26, 9
import java.util.*;
// 27, 9
import org.apache.hadoop.util.StringUtils;
// 28, 9
import org.apache.hadoop.hbase.util.Bytes;
// 29, 9
import org.apache.hadoop.hbase.master.HMaster;
// 30, 9
import org.apache.hadoop.hbase.HConstants;
// 31, 9
import org.apache.hadoop.hbase.ServerName;
// 32, 9
import org.apache.hadoop.hbase.ClusterStatus;

@org.jamon.annotations.Template(
  signature = "090F5CDDAD95701B0A531F343D263FA8",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "master", type = "HMaster")})
public class BackupMasterListTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public BackupMasterListTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  public BackupMasterListTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/master/BackupMasterListTmpl");
  }
  
  protected interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf{
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 22, 1
    public void setMaster(HMaster master)
    {
      // 22, 1
      m_master = master;
    }
    public HMaster getMaster()
    {
      return m_master;
    }
    private HMaster m_master;
  }
  @Override
  protected ImplData makeImplData()
  {
    return new ImplData();
  }
  @Override @SuppressWarnings("unchecked") public ImplData getImplData()
  {
    return (ImplData) super.getImplData();
  }
  
  
  @Override
  public org.jamon.AbstractTemplateImpl constructImpl(Class<? extends org.jamon.AbstractTemplateImpl> p_class){
    try
    {
      return p_class
        .getConstructor(new Class [] { org.jamon.TemplateManager.class, ImplData.class })
        .newInstance(new Object [] { getTemplateManager(), getImplData()});
    }
    catch (RuntimeException e)
    {
      throw e;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  protected org.jamon.AbstractTemplateImpl constructImpl(){
    return new BackupMasterListTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final HMaster master)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, master);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final HMaster master)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, master);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final HMaster master)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setMaster(master);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}
