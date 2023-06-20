package fm.castbox.mediation;

import android.app.Activity;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.ads.BidderTokenProvider;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import fm.castbox.mediation.SDKManager;
import fm.castbox.mediation.error.AdError;
import fm.castbox.mediation.helper.AudienceNetworkInitializeHelper;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class SDKManager {
    private static final int INITIALIZATION_PHASES = 2;
    private static volatile SDKManager INSTANCE = null;
    private static final String TAG = "SDKManager";
    private String audienceNetworkBuyerId;
    private String idfa;
    private String userAgent;
    private final AtomicInteger phases = new AtomicInteger(0);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    /* renamed from: fm.castbox.mediation.SDKManager$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements Callable<String> {
        final /* synthetic */ Activity val$activity;

        AnonymousClass3(Activity activity) {
            SDKManager.this = r1;
            this.val$activity = activity;
        }

        public static /* synthetic */ void a(AtomicReference atomicReference, Activity activity, Semaphore semaphore) {
            lambda$call$0(atomicReference, activity, semaphore);
        }

        public static /* synthetic */ void lambda$call$0(AtomicReference atomicReference, Activity activity, Semaphore semaphore) {
            atomicReference.set(new WebView(activity).getSettings().getUserAgentString());
            String str = SDKManager.TAG;
            Log.i(str, "User-Agent fetched - " + ((String) atomicReference.get()));
            semaphore.release();
        }

        @Override // java.util.concurrent.Callable
        public String call() throws Exception {
            final Semaphore semaphore = new Semaphore(0);
            final AtomicReference atomicReference = new AtomicReference();
            final Activity activity = this.val$activity;
            this.val$activity.runOnUiThread(new Runnable() { // from class: fm.castbox.mediation.b
                @Override // java.lang.Runnable
                public final void run() {
                    SDKManager.AnonymousClass3.a(atomicReference, activity, semaphore);
                }
            });
            try {
                semaphore.acquire();
                return (String) atomicReference.get();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
                throw e10;
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface OnInitializationCompleteListener {
        void onDone();

        void onFailure(AdError adError);

        void ongoing();
    }

    private SDKManager() {
    }

    public static /* synthetic */ void a(SDKManager sDKManager, Activity activity, OnInitializationCompleteListener onInitializationCompleteListener) {
        sDKManager.lambda$initialize$0(activity, onInitializationCompleteListener);
    }

    private void checkInitializationStatus() {
        if (this.phases.get() == 2) {
            return;
        }
        Log.e(TAG, "SDK initialization not completed");
    }

    public static SDKManager getInstance() {
        if (INSTANCE == null) {
            synchronized (SDKManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SDKManager();
                }
            }
        }
        return INSTANCE;
    }

    private void initAudienceNetwork(final Activity activity) throws ExecutionException, InterruptedException {
        new AudienceNetworkInitializeHelper(activity, new AudienceNetworkInitializeHelper.Listener() { // from class: fm.castbox.mediation.SDKManager.1
            {
                SDKManager.this = this;
            }

            @Override // fm.castbox.mediation.helper.AudienceNetworkInitializeHelper.Listener
            public void onFailure(String str) {
            }

            @Override // fm.castbox.mediation.helper.AudienceNetworkInitializeHelper.Listener
            public void onSuccess() {
                SDKManager.this.phases.getAndIncrement();
            }
        }).initialize();
        String bidderToken = BidderTokenProvider.getBidderToken(activity);
        this.audienceNetworkBuyerId = bidderToken;
        String str = TAG;
        Log.d(str, "buyerId fetched - " + bidderToken);
        Future submit = this.executorService.submit(new Callable<String>() { // from class: fm.castbox.mediation.SDKManager.2
            {
                SDKManager.this = this;
            }

            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(activity.getApplicationContext());
                    String str2 = SDKManager.TAG;
                    Log.i(str2, "IDFA fetched - " + advertisingIdInfo.getId());
                    return advertisingIdInfo.getId();
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException e10) {
                    throw e10;
                }
            }
        });
        Future submit2 = this.executorService.submit(new AnonymousClass3(activity));
        try {
            this.idfa = (String) submit.get();
            this.userAgent = (String) submit2.get();
            this.phases.getAndIncrement();
        } catch (InterruptedException | ExecutionException e10) {
            e10.printStackTrace();
            throw e10;
        }
    }

    public /* synthetic */ void lambda$initialize$0(Activity activity, OnInitializationCompleteListener onInitializationCompleteListener) {
        try {
            initAudienceNetwork(activity);
            if (onInitializationCompleteListener != null) {
                onInitializationCompleteListener.onDone();
            }
            String str = TAG;
            Log.i(str, "User-Agent: " + this.userAgent);
            Log.i(str, "IDFA: " + this.idfa);
            Log.i(str, "AudienceNetwork Buyer ID: " + this.audienceNetworkBuyerId);
        } catch (InterruptedException | ExecutionException e10) {
            e10.printStackTrace();
            AdError adError = new AdError(1, "failed to initialize sdk", "sdk.initialization", null);
            if (onInitializationCompleteListener != null) {
                onInitializationCompleteListener.onFailure(adError);
            }
        }
    }

    public SDKManager addTestDevice(String str) {
        Log.e(TAG, String.format("do not add test device hash id %s in production", str));
        return this;
    }

    public String getAudienceNetworkBuyerId() {
        checkInitializationStatus();
        return this.audienceNetworkBuyerId;
    }

    public String getIdfa() {
        checkInitializationStatus();
        return this.idfa;
    }

    public String getUserAgent() {
        checkInitializationStatus();
        return this.userAgent;
    }

    public final void initialize(final Activity activity, final OnInitializationCompleteListener onInitializationCompleteListener) {
        if (this.phases.get() == 0) {
            new Thread(new Runnable() { // from class: fm.castbox.mediation.a
                @Override // java.lang.Runnable
                public final void run() {
                    SDKManager.a(SDKManager.this, activity, onInitializationCompleteListener);
                }
            }).start();
        } else if (onInitializationCompleteListener != null) {
            if (this.phases.get() == 2) {
                onInitializationCompleteListener.onDone();
            } else {
                onInitializationCompleteListener.ongoing();
            }
        }
    }
}
