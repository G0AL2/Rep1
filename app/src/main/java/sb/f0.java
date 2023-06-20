package sb;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzxe;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zze;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class f0 {
    public static zzxe a(AuthCredential authCredential, String str) {
        Preconditions.checkNotNull(authCredential);
        if (GoogleAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return GoogleAuthCredential.l1((GoogleAuthCredential) authCredential, str);
        }
        if (FacebookAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return FacebookAuthCredential.l1((FacebookAuthCredential) authCredential, str);
        }
        if (TwitterAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return TwitterAuthCredential.l1((TwitterAuthCredential) authCredential, str);
        }
        if (GithubAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return GithubAuthCredential.l1((GithubAuthCredential) authCredential, str);
        }
        if (PlayGamesAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return PlayGamesAuthCredential.l1((PlayGamesAuthCredential) authCredential, str);
        }
        if (zze.class.isAssignableFrom(authCredential.getClass())) {
            return zze.n1((zze) authCredential, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
