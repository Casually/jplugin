package net.jplugin.ext.gtrace;

import net.jplugin.core.ctx.ExtensionCtxHelper;
import net.jplugin.core.kernel.api.AbstractBasicPlugin;
import net.jplugin.core.kernel.api.CoreServicePriority;
import net.jplugin.core.kernel.api.ExtensionKernelHelper;
import net.jplugin.ext.gtrace.impl.ESFRestFilter4Trace;
import net.jplugin.ext.gtrace.impl.ESFRpcFilter4Trace;
import net.jplugin.ext.gtrace.impl.ExecuterFilter4TraceLog;
import net.jplugin.ext.gtrace.impl.HttpClientFilter4TraceLog;
import net.jplugin.ext.gtrace.impl.HttpFilter4TraceLog;
import net.jplugin.ext.gtrace.impl.PluginInitFilter4Trace;
import net.jplugin.ext.gtrace.impl.RuleFilter4TraceLog;
import net.jplugin.ext.gtrace.impl.RunnableInitFilter4Trace;
import net.jplugin.ext.gtrace.impl.ScheduledExeFilter4Trace;
import net.jplugin.ext.webasic.ExtensionWebHelper;

public class Plugin extends AbstractBasicPlugin {
	public Plugin() {
		ExtensionWebHelper.addHttpFilterExtension(this,HttpFilter4TraceLog.class );
		ExtensionKernelHelper.addExecutorFilterExtension(this, ExecuterFilter4TraceLog.class);
		ExtensionKernelHelper.addExeRunInitFilterExtension(this, RunnableInitFilter4Trace.class);
		ExtensionKernelHelper.addHttpClientFilterExtension(this, HttpClientFilter4TraceLog.class);
		ExtensionWebHelper.addESFRpcFilterExtension(this, ESFRpcFilter4Trace.class);
		ExtensionWebHelper.addESFRestFilterExtension(this, ESFRestFilter4Trace.class);
		ExtensionKernelHelper.addPluginEnvInitFilterExtension(this, PluginInitFilter4Trace.class);
		ExtensionCtxHelper.addRuleServiceFilterExtension(this, RuleFilter4TraceLog.class);
		ExtensionKernelHelper.addScheduledExecutionFilterExtension(this, ScheduledExeFilter4Trace.class);
	}
	@Override
	public void init() {
		
	}

	@Override
	public int getPrivority() {
		return CoreServicePriority.GTRACE;
	}

}
