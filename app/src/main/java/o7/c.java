package o7;

import com.google.ads.mediation.unity.a;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: UnityRewardedEventAdapter.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    final MediationRewardedAdCallback f35016a;

    /* compiled from: UnityRewardedEventAdapter.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35017a;

        static {
            int[] iArr = new int[a.b.values().length];
            f35017a = iArr;
            try {
                iArr[a.b.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35017a[a.b.CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35017a[a.b.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35017a[a.b.IMPRESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35017a[a.b.VIDEO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35017a[a.b.REWARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35017a[a.b.VIDEO_COMPLETE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public c(MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.f35016a = mediationRewardedAdCallback;
    }

    public void a(a.b bVar) {
        if (this.f35016a == null) {
            return;
        }
        switch (a.f35017a[bVar.ordinal()]) {
            case 1:
                this.f35016a.onAdOpened();
                return;
            case 2:
                this.f35016a.reportAdClicked();
                return;
            case 3:
                this.f35016a.onAdClosed();
                return;
            case 4:
                this.f35016a.reportAdImpression();
                return;
            case 5:
                this.f35016a.onVideoStart();
                return;
            case 6:
                this.f35016a.onUserEarnedReward(new com.google.ads.mediation.unity.c());
                return;
            case 7:
                this.f35016a.onVideoComplete();
                return;
            default:
                return;
        }
    }
}
