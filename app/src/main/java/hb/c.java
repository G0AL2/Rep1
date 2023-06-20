package hb;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@RecentlyNonNull e eVar);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    int getConsentStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull d dVar, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar);

    void reset();
}
