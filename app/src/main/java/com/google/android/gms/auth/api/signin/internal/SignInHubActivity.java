package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
@KeepName
/* loaded from: classes2.dex */
public class SignInHubActivity extends d {
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    private final void zbc() {
        getSupportLoaderManager().c(0, null, new zbw(this, null));
        zba = false;
    }

    private final void zbd(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount zba2 = signInAccount.zba();
                zbn zbc = zbn.zbc(this);
                GoogleSignInOptions zba3 = this.zbc.zba();
                Objects.requireNonNull(zba2);
                zbc.zbe(zba3, zba2);
                intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", zba2);
                this.zbd = true;
                this.zbe = i11;
                this.zbf = intent;
                zbc();
                return;
            } else if (intent.hasExtra(IronSourceConstants.EVENTS_ERROR_CODE)) {
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 8);
                if (intExtra == 13) {
                    intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            Objects.requireNonNull(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.zbc = signInConfiguration;
            if (bundle == null) {
                if (zba) {
                    setResult(0);
                    zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                    return;
                }
                zba = true;
                zbe(action);
                return;
            }
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.zbd = z10;
            if (z10) {
                this.zbe = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                Objects.requireNonNull(intent2);
                this.zbf = intent2;
                zbc();
            }
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
