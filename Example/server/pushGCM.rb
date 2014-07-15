require 'rubygems'
require 'pushmeup'
GCM.host = 'https://android.googleapis.com/gcm/send'
GCM.format = :json
GCM.key = "AIzaSyAW1Vq1tpsukwQArwFC6CwTRDkDVS5lfPc"
destination = ["APA91bGovaAOr-QQhAesfUbWR0bqSR7llmfog_P4kYUl1GWHWE5VonL7xPOGXTxfTy84nyVAdtDJIdUTwlUJpQcucUsF4sfEickLtILXTQU_Uu12f8N0LQArPWGMVQg9_t-L6awBtk3MuwVtZbr8ZtL_OFATbI7fiQ"]
data = { :type => "ABOUT_HURDLR", :title => "View Hurdlr's info!", :message => "<>\"\\' &)(@# {aaa  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", :redirectUrl => "pendingExpenses", :redirectData => {},  }

GCM.send_notification( destination, data)
