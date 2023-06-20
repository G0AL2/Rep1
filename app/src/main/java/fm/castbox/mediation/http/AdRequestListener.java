package fm.castbox.mediation.http;

import fm.castbox.mediation.error.AdError;
import fm.castbox.mediation.model.ad.Bid;
import fm.castbox.mediation.model.ad.Waterfall;
import java.util.List;

/* loaded from: classes3.dex */
public interface AdRequestListener {
    void onFailure(AdError adError);

    void onResponse(String str, List<Bid> list, List<Waterfall> list2);
}
