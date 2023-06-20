package sb;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.safetynet.SafetyNetApi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final String f36962a = "s";

    public static boolean a(SafetyNetApi.AttestationResponse attestationResponse) {
        if (attestationResponse != null && !TextUtils.isEmpty(attestationResponse.getJwsResult())) {
            com.google.firebase.auth.internal.e a10 = com.google.firebase.auth.internal.e.a(attestationResponse.getJwsResult());
            if (a10 == null) {
                Log.e(f36962a, "Unable to parse SafetyNet AttestationResponse");
                return false;
            } else if (!a10.c()) {
                Log.e(f36962a, "SafetyNet Attestation fails basic integrity.");
                return false;
            } else if (TextUtils.isEmpty(a10.b())) {
                return true;
            } else {
                Log.e(f36962a, "SafetyNet Attestation has advice: \n".concat(String.valueOf(a10.b())));
                return false;
            }
        }
        Log.e(f36962a, "No SafetyNet AttestationResponse passed.");
        return false;
    }
}
