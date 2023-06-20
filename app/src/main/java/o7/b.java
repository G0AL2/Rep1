package o7;

import com.google.ads.mediation.unity.a;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: UnityInterstitialEventAdapter.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final MediationInterstitialListener f35013a;

    /* renamed from: b  reason: collision with root package name */
    final MediationInterstitialAdapter f35014b;

    /* compiled from: UnityInterstitialEventAdapter.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35015a;

        static {
            int[] iArr = new int[a.b.values().length];
            f35015a = iArr;
            try {
                iArr[a.b.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35015a[a.b.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35015a[a.b.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35015a[a.b.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35015a[a.b.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public b(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f35013a = mediationInterstitialListener;
        this.f35014b = mediationInterstitialAdapter;
    }

    public void a(a.b bVar) {
        if (this.f35013a == null) {
            return;
        }
        int i10 = a.f35015a[bVar.ordinal()];
        if (i10 == 1) {
            this.f35013a.onAdLoaded(this.f35014b);
        } else if (i10 == 2) {
            this.f35013a.onAdOpened(this.f35014b);
        } else if (i10 == 3) {
            this.f35013a.onAdClicked(this.f35014b);
        } else if (i10 == 4) {
            this.f35013a.onAdClosed(this.f35014b);
        } else if (i10 != 5) {
        } else {
            this.f35013a.onAdLeftApplication(this.f35014b);
        }
    }
}
