package com.google.android.ads.mediationtestsuite;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ads.mediationtestsuite.activities.HomeActivity;
import com.google.android.ads.mediationtestsuite.dataobjects.AdFormat;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigResponse;
import com.google.android.ads.mediationtestsuite.utils.k;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import java.io.IOException;
import q2.p;
import q2.u;

/* loaded from: classes2.dex */
public class MediationTestSuite {
    private static final MediationTestSuite instance = new MediationTestSuite();
    private MediationTestSuiteListener listener;
    private AdRequest testRequest;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements p.b<ConfigResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20742b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f20743c;

        a(Context context, String str, boolean z10) {
            this.f20741a = context;
            this.f20742b = str;
            this.f20743c = z10;
        }

        @Override // q2.p.b
        /* renamed from: b */
        public void a(ConfigResponse configResponse) {
            if (k.k(this.f20741a)) {
                MediationTestSuite.launchTestSuiteInternal(this.f20741a, this.f20742b, this.f20743c);
            } else {
                MediationTestSuite.logNonDebuggableBuildError(this.f20741a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20744a;

        b(Context context) {
            this.f20744a = context;
        }

        @Override // q2.p.a
        public void a(u uVar) {
            MediationTestSuite.logNonDebuggableBuildError(this.f20744a);
        }
    }

    private MediationTestSuite() {
    }

    public static MediationTestSuiteListener getListener() {
        return instance.listener;
    }

    public static AdRequest getTestRequest() {
        return instance.testRequest;
    }

    public static void launch(Context context) {
        launchWithAppId(context, com.google.android.ads.mediationtestsuite.utils.c.h(context), false);
    }

    public static void launchForAdManager(Context context) {
        launchWithAppId(context, com.google.android.ads.mediationtestsuite.utils.c.h(context), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void launchTestSuiteInternal(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, HomeActivity.class);
        intent.putExtra("app_id", str);
        k.s().q(str);
        k.s().o(z10 || str.matches("^/\\d+~.*$"));
        r7.c.b(new r7.a(), context);
        context.startActivity(intent);
    }

    private static void launchWithAppId(Context context, String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            Log.d("gma_test", context.getString(g.N));
        } else if (!k.l(context) && !com.google.android.ads.mediationtestsuite.utils.c.j(context)) {
            com.google.android.ads.mediationtestsuite.utils.e.q(context, str);
            k.s().o(z10 || str.matches("^/\\d+~.*$"));
            try {
                com.google.android.ads.mediationtestsuite.utils.g.h(new a(context, str, z10), new b(context));
            } catch (IOException unused) {
                logNonDebuggableBuildError(context);
            }
        } else {
            launchTestSuiteInternal(context, str, z10);
        }
    }

    private static void loadTestAdToLogDeviceHash(Context context) {
        AdView adView = new AdView(context);
        adView.setAdUnitId(com.google.android.ads.mediationtestsuite.utils.b.d(AdFormat.BANNER));
        adView.setAdSize(AdSize.BANNER);
        adView.loadAd(new AdRequest.Builder().build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logNonDebuggableBuildError(Context context) {
        Log.d("gma_test", context.getString(g.O));
        loadTestAdToLogDeviceHash(context);
    }

    public static void setAdRequest(AdRequest adRequest) {
        instance.testRequest = adRequest;
    }

    public static void setListener(MediationTestSuiteListener mediationTestSuiteListener) {
        instance.listener = mediationTestSuiteListener;
    }

    static void setUserAgentSuffix(String str) {
        k.s().r(str);
    }

    @Deprecated
    public static void launch(Context context, String str) {
        launchWithAppId(context, str, false);
    }
}
