package fm.castbox.mediation.http;

import fm.castbox.mediation.error.AdError;

/* loaded from: classes3.dex */
public interface DisplayNotificationListener {
    void onFailure(AdError adError);

    void onSuccess();
}
