package com.plugin.gcm;

import android.content.Context;

import android.support.v4.content.WakefulBroadcastReceiver;

/*
 * Implementation of GCMBroadcastReceiver that hard-wires the intent service to be 
 * com.plugin.gcm.GCMIntentService, instead of your_package.GCMIntentService 
 */
public class CordovaGCMBroadcastReceiver extends WakefulBroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		ComponentName comp = new ComponentName(context.getPackageName(), GCMIntentService.class.getName());
		startWakefulService(context, (intent.setComponent(comp)));
		setResultCode(Activity.RESULT_OK);
	}
	// @Override
	// protected String getGCMIntentServiceClassName(Context context) {
 //    	return "com.plugin.gcm" + DEFAULT_INTENT_SERVICE_CLASS_NAME;
 //    }
	
}