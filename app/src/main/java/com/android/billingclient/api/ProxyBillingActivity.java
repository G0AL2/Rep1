package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f6002a;

    /* renamed from: b  reason: collision with root package name */
    private ResultReceiver f6003b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6004c;

    private Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ProxyBillingActivity"
            r3 = 100
            if (r6 != r3) goto L73
            com.android.billingclient.api.e r6 = com.google.android.gms.internal.play_billing.zzb.zzh(r8, r2)
            int r6 = r6.b()
            r3 = -1
            if (r7 != r3) goto L1c
            if (r6 == 0) goto L1a
            r7 = -1
            goto L1c
        L1a:
            r6 = 0
            goto L3a
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 85
            r3.<init>(r4)
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = " and billing's responseCode: "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = r3.toString()
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r7)
        L3a:
            android.os.ResultReceiver r7 = r5.f6002a
            if (r7 == 0) goto L49
            if (r8 != 0) goto L41
            goto L45
        L41:
            android.os.Bundle r0 = r8.getExtras()
        L45:
            r7.send(r6, r0)
            goto La5
        L49:
            android.content.Intent r6 = r5.a()
            if (r8 == 0) goto L6f
            android.os.Bundle r7 = r8.getExtras()
            if (r7 == 0) goto L5d
            android.os.Bundle r7 = r8.getExtras()
            r6.putExtras(r7)
            goto L6f
        L5d:
            java.lang.String r7 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r7)
            r7 = 6
            java.lang.String r8 = "RESPONSE_CODE"
            r6.putExtra(r8, r7)
            java.lang.String r7 = "DEBUG_MESSAGE"
            java.lang.String r8 = "An internal error occurred."
            r6.putExtra(r7, r8)
        L6f:
            r5.sendBroadcast(r6)
            goto La5
        L73:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L8a
            int r6 = com.google.android.gms.internal.play_billing.zzb.zza(r8, r2)
            android.os.ResultReceiver r7 = r5.f6003b
            if (r7 == 0) goto La5
            if (r8 != 0) goto L82
            goto L86
        L82:
            android.os.Bundle r0 = r8.getExtras()
        L86:
            r7.send(r6, r0)
            goto La5
        L8a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 69
            r7.<init>(r8)
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r6)
        La5:
            r5.f6004c = r1
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i10;
        super.onCreate(bundle);
        if (bundle == null) {
            zzb.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
            try {
                if (getIntent().hasExtra("BUY_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.f6002a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.f6003b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i10 = 101;
                    this.f6004c = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
                    return;
                } else {
                    pendingIntent = null;
                }
                this.f6004c = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e10) {
                zzb.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
                ResultReceiver resultReceiver = this.f6002a;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f6003b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent a10 = a();
                        a10.putExtra("RESPONSE_CODE", 6);
                        a10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(a10);
                    }
                }
                this.f6004c = false;
                finish();
                return;
            }
            i10 = 100;
        } else {
            zzb.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f6004c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f6002a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f6003b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f6004c) {
            Intent a10 = a();
            a10.putExtra("RESPONSE_CODE", 1);
            a10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a10);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f6002a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f6003b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f6004c);
    }
}
