package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import cb.r;

/* loaded from: classes3.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f23116a;

    public static void a(Context context) {
        r.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i12;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0 && (resultReceiver = this.f23116a) != null) {
            if (i11 == -1) {
                bundle = new Bundle();
                i12 = 1;
            } else if (i11 == 0) {
                bundle = new Bundle();
                i12 = 2;
            }
            resultReceiver.send(i12, bundle);
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f23116a = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f23116a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        try {
            startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, null, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            ResultReceiver resultReceiver = this.f23116a;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f23116a);
    }
}
