package s7;

import android.content.Context;
import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: NativeAssetsViewModel.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f36785a;

    public j(Context context, NativeAd nativeAd) {
        this.f36785a = a(context, nativeAd);
    }

    private static String a(Context context, NativeAd nativeAd) {
        StringBuilder sb2 = new StringBuilder();
        if (!com.google.android.ads.mediationtestsuite.utils.j.a(nativeAd.getHeadline())) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.X, nativeAd.getHeadline()));
            sb2.append("\n");
        }
        if (!com.google.android.ads.mediationtestsuite.utils.j.a(nativeAd.getBody())) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.T, nativeAd.getBody()));
            sb2.append("\n");
        }
        if (!com.google.android.ads.mediationtestsuite.utils.j.a(nativeAd.getAdvertiser())) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.S, nativeAd.getAdvertiser()));
            sb2.append("\n");
        }
        if (!com.google.android.ads.mediationtestsuite.utils.j.a(nativeAd.getCallToAction())) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.W, nativeAd.getCallToAction()));
            sb2.append("\n");
        }
        if (!com.google.android.ads.mediationtestsuite.utils.j.a(nativeAd.getPrice())) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.f20846a0, nativeAd.getPrice()));
            sb2.append("\n");
        }
        if (nativeAd.getStarRating() != null && nativeAd.getStarRating().doubleValue() > 0.0d) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.f20848b0, nativeAd.getStarRating()));
            sb2.append("\n");
        }
        if (!com.google.android.ads.mediationtestsuite.utils.j.a(nativeAd.getStore())) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.f20850c0, nativeAd.getStore()));
            sb2.append("\n");
        }
        if (nativeAd.getMediaContent() != null && nativeAd.getMediaContent().hasVideoContent()) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.V));
        } else {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.U));
        }
        sb2.append("\n");
        if (!nativeAd.getImages().isEmpty() && nativeAd.getImages().get(0).getUri() != null) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.Z, nativeAd.getImages().get(0).getUri().toString()));
            sb2.append("\n");
        }
        if (nativeAd.getIcon() != null && nativeAd.getIcon().getUri() != null) {
            sb2.append(context.getString(com.google.android.ads.mediationtestsuite.g.Y, nativeAd.getIcon().getUri().toString()));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public String b() {
        return this.f36785a;
    }
}
