package net.jplugin.core.lock;

import net.jplugin.core.kernel.api.AbstractPlugin;
import net.jplugin.core.kernel.api.CoreServicePriority;

public class Plugin extends AbstractPlugin{

	public void onCreateServices() {
		
	}

	@Override
	public int getPrivority() {
		return CoreServicePriority.LOCK;
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean searchClazzForExtension() {
		return false;
	}

}
