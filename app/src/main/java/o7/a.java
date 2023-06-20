package o7;

import com.google.ads.mediation.unity.a;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* compiled from: UnityBannerEventAdapter.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    final MediationBannerListener f35010a;

    /* renamed from: b  reason: collision with root package name */
    final MediationBannerAdapter f35011b;

    /* compiled from: UnityBannerEventAdapter.java */
    /* renamed from: o7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C0464a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35012a;

        static {
            int[] iArr = new int[a.b.values().length];
            f35012a = iArr;
            try {
                iArr[a.b.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35012a[a.b.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35012a[a.b.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35012a[a.b.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35012a[a.b.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(MediationBannerListener mediationBannerListener, MediationBannerAdapter mediationBannerAdapter) {
        this.f35010a = mediationBannerListener;
        this.f35011b = mediationBannerAdapter;
    }

    public void a(a.b bVar) {
        if (this.f35010a == null) {
            return;
        }
        int i10 = C0464a.f35012a[bVar.ordinal()];
        if (i10 == 1) {
            this.f35010a.onAdLoaded(this.f35011b);
        } else if (i10 == 2) {
            this.f35010a.onAdOpened(this.f35011b);
        } else if (i10 == 3) {
            this.f35010a.onAdClicked(this.f35011b);
        } else if (i10 == 4) {
            this.f35010a.onAdClosed(this.f35011b);
        } else if (i10 != 5) {
        } else {
            this.f35010a.onAdLeftApplication(this.f35011b);
        }
    }
}
