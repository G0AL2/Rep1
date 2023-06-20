package hb;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzd;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class f {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public interface a {
        void onConsentFormLoadFailure(@RecentlyNonNull e eVar);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public interface b {
        void onConsentFormLoadSuccess(@RecentlyNonNull hb.b bVar);
    }

    @RecentlyNonNull
    public static c a(@RecentlyNonNull Context context) {
        return zzd.zza(context).zzb();
    }

    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar) {
        zzd.zza(context).zzc().zza(bVar, aVar);
    }
}
