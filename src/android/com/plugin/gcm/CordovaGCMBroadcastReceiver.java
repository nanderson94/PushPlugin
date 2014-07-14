package com.plugin.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;
import android.app.Activity;

import android.support.v4.content.WakefulBroadcastReceiver;

/*
 * Implementation of GCMBroadcastReceiver that hard-wires the intent service to be 
 * com.plugin.gcm.GcmntentService, instead of your_package.GcmIntentService 
 */
public class CordovaGCMBroadcastReceiver extends WakefulBroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		ComponentName comp = new ComponentName(context.getPackageName(), GcmIntentService.class.getName());
		startWakefulService(context, (intent.setComponent(comp)));
		setResultCode(Activity.RESULT_OK);
	}
	// @Override
	// protected String getGCMIntentServiceClassName(Context context) {
 //    	return "com.plugin.gcm" + DEFAULT_INTENT_SERVICE_CLASS_NAME;
 //    }
	
}