package net.jplugin.core.scheduler;

import net.jplugin.core.kernel.api.AbstractBasicPlugin;
import net.jplugin.core.kernel.api.CoreServicePriority;

/**
 *
 * @author: LiuHang
 * @version 创建时间：2015-2-15 下午02:39:52
 **/

public class Plugin extends AbstractBasicPlugin{

	/* (non-Javadoc)
	 * @see net.luis.common.kernel.api.AbstractPlugin#getPrivority()
	 */
	@Override
	public int getPrivority() {
		return CoreServicePriority.SCHEDULER;
	}

	/* (non-Javadoc)
	 * @see net.luis.common.kernel.api.IPlugin#init()
	 */
	public void onCreateServices() {
		
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

}
