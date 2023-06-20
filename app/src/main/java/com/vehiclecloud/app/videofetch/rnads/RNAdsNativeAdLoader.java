package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative;
import ee.q;
import ee.u;
import fe.h0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.d;
import qe.g;
import qe.k;
import we.e;
import we.e0;
import we.i1;
import we.s0;
import we.u1;

/* compiled from: RNAdsNativeAdLoader.kt */
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_RELOAD_INTERVAL = 20000;
    private final Map<Integer, AdCache> cache;
    private final FirebaseAnalytics mAnalytics;
    private final RNAdsNative<?> mNative;
    private final AdCache nativeBannerCache;
    private final AdCache nativeCache;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RNAdsNativeAdLoader.kt */
    /* loaded from: classes3.dex */
    public static final class AdCache {
        private final List<RNAdsNativeManager> list = new ArrayList();
        private final b mutex = d.b(false, 1, null);

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[Catch: all -> 0x006f, LOOP:0: B:19:0x0054->B:21:0x005a, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:18:0x004e, B:19:0x0054, B:21:0x005a, B:22:0x0064), top: B:28:0x004e }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object destroy(ie.d<? super ee.u> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$destroy$1
                if (r0 == 0) goto L13
                r0 = r6
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$destroy$1 r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$destroy$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$destroy$1 r0 = new com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$destroy$1
                r0.<init>(r5, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = je.b.c()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 != r4) goto L32
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache) r0
                ee.o.b(r6)
                goto L4e
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L3a:
                ee.o.b(r6)
                kotlinx.coroutines.sync.b r6 = r5.mutex
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r0 = r6.a(r3, r0)
                if (r0 != r1) goto L4c
                return r1
            L4c:
                r0 = r5
                r1 = r6
            L4e:
                java.util.List<com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager> r6 = r0.list     // Catch: java.lang.Throwable -> L6f
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L6f
            L54:
                boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L6f
                if (r2 == 0) goto L64
                java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L6f
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r2 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager) r2     // Catch: java.lang.Throwable -> L6f
                r2.destroyAd$app_orangeRelease()     // Catch: java.lang.Throwable -> L6f
                goto L54
            L64:
                java.util.List<com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager> r6 = r0.list     // Catch: java.lang.Throwable -> L6f
                r6.clear()     // Catch: java.lang.Throwable -> L6f
                ee.u r6 = ee.u.f29813a     // Catch: java.lang.Throwable -> L6f
                r1.b(r3)
                return r6
            L6f:
                r6 = move-exception
                r1.b(r3)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache.destroy(ie.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object get(ie.d<? super com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$get$1
                if (r0 == 0) goto L13
                r0 = r6
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$get$1 r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$get$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$get$1 r0 = new com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$get$1
                r0.<init>(r5, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = je.b.c()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 != r4) goto L32
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache) r0
                ee.o.b(r6)
                goto L4e
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L3a:
                ee.o.b(r6)
                kotlinx.coroutines.sync.b r6 = r5.mutex
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r0 = r6.a(r3, r0)
                if (r0 != r1) goto L4c
                return r1
            L4c:
                r0 = r5
                r1 = r6
            L4e:
                java.util.List<com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager> r6 = r0.list     // Catch: java.lang.Throwable -> L5a
                java.lang.Object r6 = fe.n.u(r6)     // Catch: java.lang.Throwable -> L5a
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r6 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager) r6     // Catch: java.lang.Throwable -> L5a
                r1.b(r3)
                return r6
            L5a:
                r6 = move-exception
                r1.b(r3)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache.get(ie.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:18:0x004e, B:19:0x0054, B:21:0x005a, B:28:0x006f, B:31:0x0075), top: B:37:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:18:0x004e, B:19:0x0054, B:21:0x005a, B:28:0x006f, B:31:0x0075), top: B:37:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object getLoaded(ie.d<? super com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$getLoaded$1
                if (r0 == 0) goto L13
                r0 = r8
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$getLoaded$1 r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$getLoaded$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$getLoaded$1 r0 = new com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$getLoaded$1
                r0.<init>(r7, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = je.b.c()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache) r0
                ee.o.b(r8)
                goto L4e
            L32:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L3a:
                ee.o.b(r8)
                kotlinx.coroutines.sync.b r8 = r7.mutex
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r0 = r8.a(r4, r0)
                if (r0 != r1) goto L4c
                return r1
            L4c:
                r0 = r7
                r1 = r8
            L4e:
                java.util.List<com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager> r8 = r0.list     // Catch: java.lang.Throwable -> L7e
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L7e
            L54:
                boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L7e
                if (r2 == 0) goto L6e
                java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L7e
                r5 = r2
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r5 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager) r5     // Catch: java.lang.Throwable -> L7e
                int r5 = r5.getState$app_orangeRelease()     // Catch: java.lang.Throwable -> L7e
                r6 = 2
                if (r5 != r6) goto L6a
                r5 = 1
                goto L6b
            L6a:
                r5 = 0
            L6b:
                if (r5 == 0) goto L54
                goto L6f
            L6e:
                r2 = r4
            L6f:
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r2 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager) r2     // Catch: java.lang.Throwable -> L7e
                if (r2 != 0) goto L75
                r2 = r4
                goto L7a
            L75:
                java.util.List<com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager> r8 = r0.list     // Catch: java.lang.Throwable -> L7e
                r8.remove(r2)     // Catch: java.lang.Throwable -> L7e
            L7a:
                r1.b(r4)
                return r2
            L7e:
                r8 = move-exception
                r1.b(r4)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache.getLoaded(ie.d):java.lang.Object");
        }

        public final boolean isEmpty() {
            return this.list.isEmpty();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object put(com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager r6, ie.d<? super ee.u> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$put$1
                if (r0 == 0) goto L13
                r0 = r7
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$put$1 r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$put$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$put$1 r0 = new com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache$put$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = je.b.c()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 != r4) goto L38
                java.lang.Object r6 = r0.L$2
                kotlinx.coroutines.sync.b r6 = (kotlinx.coroutines.sync.b) r6
                java.lang.Object r1 = r0.L$1
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r1 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager) r1
                java.lang.Object r0 = r0.L$0
                com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache) r0
                ee.o.b(r7)
                r7 = r6
                r6 = r1
                goto L55
            L38:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L40:
                ee.o.b(r7)
                kotlinx.coroutines.sync.b r7 = r5.mutex
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r4
                java.lang.Object r0 = r7.a(r3, r0)
                if (r0 != r1) goto L54
                return r1
            L54:
                r0 = r5
            L55:
                java.util.List<com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager> r0 = r0.list     // Catch: java.lang.Throwable -> L60
                r0.add(r6)     // Catch: java.lang.Throwable -> L60
                r7.b(r3)
                ee.u r6 = ee.u.f29813a
                return r6
            L60:
                r6 = move-exception
                r7.b(r3)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache.put(com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager, ie.d):java.lang.Object");
        }
    }

    /* compiled from: RNAdsNativeAdLoader.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: RNAdsNativeAdLoader.kt */
        /* loaded from: classes3.dex */
        private static final class NativeAdState {
            public static final int Failed = 3;
            public static final NativeAdState INSTANCE = new NativeAdState();
            public static final int Inflated = 4;
            public static final int Loaded = 2;
            public static final int Loading = 1;
            public static final int Pending = 0;

            /* compiled from: RNAdsNativeAdLoader.kt */
            @Retention(RetentionPolicy.SOURCE)
            /* loaded from: classes3.dex */
            public @interface Def {
            }

            private NativeAdState() {
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: RNAdsNativeAdLoader.kt */
    /* loaded from: classes3.dex */
    public final class RNAdsNativeManager implements RNAdsNative.Listener {

        /* renamed from: ad  reason: collision with root package name */
        private Object f28539ad;
        private final String adUnitId;
        private final int height;
        private boolean isNeedDelayRendingAd;
        private long loadTime;
        private boolean mIsActive;
        private long mReloadStartAt;
        private String mScreen;
        private LinearLayout mView;
        private int mWidth;
        private i1 reloadJob;
        private long renderStartTime;
        private int state;
        final /* synthetic */ RNAdsNativeAdLoader this$0;

        public RNAdsNativeManager(RNAdsNativeAdLoader rNAdsNativeAdLoader, String str, int i10) {
            k.f(rNAdsNativeAdLoader, "this$0");
            k.f(str, "adUnitId");
            this.this$0 = rNAdsNativeAdLoader;
            this.adUnitId = str;
            this.height = i10;
            loadAd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cancelReLoadSchedule() {
            i1 i1Var = this.reloadJob;
            if (i1Var != null) {
                i1.a.a(i1Var, null, 1, null);
            }
            this.reloadJob = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void doOnAdLoaded(Object obj) {
            this.state = 2;
            destroyAd$app_orangeRelease();
            this.f28539ad = obj;
            renderAd();
        }

        public static /* synthetic */ void getState$app_orangeRelease$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void loadAd() {
            if (this.state == 1) {
                return;
            }
            this.state = 1;
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.c(), null, new RNAdsNativeAdLoader$RNAdsNativeManager$loadAd$1(this, this.this$0, null), 2, null);
        }

        private final void renderAd() {
            Activity currentActivity;
            e0 scope;
            if (!this.mIsActive) {
                this.isNeedDelayRendingAd = true;
                return;
            }
            Object obj = this.f28539ad;
            if (obj == null) {
                return;
            }
            RNAdsNativeAdLoader rNAdsNativeAdLoader = this.this$0;
            LinearLayout linearLayout = this.mView;
            if (linearLayout == null || (currentActivity = rNAdsNativeAdLoader.reactContext.getCurrentActivity()) == null || (scope = rNAdsNativeAdLoader.getScope()) == null) {
                return;
            }
            e.b(scope, s0.c(), null, new RNAdsNativeAdLoader$RNAdsNativeManager$renderAd$1$1$1$1(this, rNAdsNativeAdLoader, currentActivity, obj, linearLayout, null), 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleReload() {
            if (this.reloadJob != null) {
                return;
            }
            e0 scope = this.this$0.getScope();
            this.reloadJob = scope != null ? e.b(scope, s0.b(), null, new RNAdsNativeAdLoader$RNAdsNativeManager$scheduleReload$1(this, null), 2, null) : null;
        }

        public final void bind(String str, int i10, RNAdsNativeView rNAdsNativeView) {
            k.f(str, "screen");
            k.f(rNAdsNativeView, "view");
            this.mScreen = str;
            this.mView = rNAdsNativeView;
            this.mWidth = i10;
            boolean z10 = rNAdsNativeView.mActive;
            this.mIsActive = z10;
            if (z10) {
                if (this.state == 2) {
                    renderAd();
                } else {
                    loadAd();
                }
            }
        }

        public final void destroyAd$app_orangeRelease() {
            if (this.f28539ad != null) {
                this.this$0.mNative.destroyByObject(this.f28539ad);
            }
        }

        public final String getAdUnitId$app_orangeRelease() {
            return this.adUnitId;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getState$app_orangeRelease() {
            return this.state;
        }

        public final boolean isCacheable() {
            int i10 = this.state;
            return i10 == 1 || i10 == 2;
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative.Listener
        public void onAdClicked() {
            LinearLayout linearLayout = this.mView;
            if (linearLayout == null) {
                return;
            }
            RNAdsNativeAdLoader rNAdsNativeAdLoader = this.this$0;
            RNAdsNativeAdLoader.emitRNEvent$default(rNAdsNativeAdLoader, linearLayout.getId(), "onPress", null, 4, null);
            e0 scope = rNAdsNativeAdLoader.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsNativeAdLoader$RNAdsNativeManager$onAdClicked$1$1(rNAdsNativeAdLoader, this, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative.Listener
        public void onAdFailedToLoad(String str) {
            k.f(str, "cause");
            this.state = 3;
            if (this.mIsActive) {
                scheduleReload();
            }
            LinearLayout linearLayout = this.mView;
            if (linearLayout == null) {
                return;
            }
            RNAdsNativeAdLoader rNAdsNativeAdLoader = this.this$0;
            int id2 = linearLayout.getId();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("error", str);
            u uVar = u.f29813a;
            rNAdsNativeAdLoader.emitRNEvent(id2, "onError", createMap);
            e0 scope = rNAdsNativeAdLoader.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsNativeAdLoader$RNAdsNativeManager$onAdFailedToLoad$1$2(rNAdsNativeAdLoader, this, str, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative.Listener
        public void onAdImpression() {
            LinearLayout linearLayout = this.mView;
            if (linearLayout == null) {
                return;
            }
            RNAdsNativeAdLoader rNAdsNativeAdLoader = this.this$0;
            int height = linearLayout.getChildAt(0).getHeight();
            linearLayout.requestLayout();
            int id2 = linearLayout.getId();
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("height", height);
            u uVar = u.f29813a;
            rNAdsNativeAdLoader.emitRNEvent(id2, "onImpression", createMap);
            e0 scope = rNAdsNativeAdLoader.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsNativeAdLoader$RNAdsNativeManager$onAdImpression$1$2(rNAdsNativeAdLoader, this, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative.Listener
        public void onAdLoaded(Object obj) {
            k.f(obj, "ad");
            doOnAdLoaded(obj);
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsNativeAdLoader$RNAdsNativeManager$onAdLoaded$1(this.this$0, this, null), 2, null);
        }

        public final void setState$app_orangeRelease(int i10) {
            this.state = i10;
        }

        public final void unbind() {
            cancelReLoadSchedule();
            this.mScreen = null;
            this.mView = null;
            this.mWidth = 0;
            this.mIsActive = false;
            this.mReloadStartAt = 0L;
        }

        public final void updateActive(boolean z10) {
            if (z10 != this.mIsActive) {
                this.mIsActive = z10;
                if (z10) {
                    if (this.state == 0) {
                        loadAd();
                    } else {
                        scheduleReload();
                    }
                    if (this.isNeedDelayRendingAd) {
                        this.isNeedDelayRendingAd = false;
                        renderAd();
                        return;
                    }
                    return;
                }
                cancelReLoadSchedule();
            }
        }
    }

    public RNAdsNativeAdLoader(ReactApplicationContext reactApplicationContext, RNAdsNative<?> rNAdsNative) {
        Map<Integer, AdCache> i10;
        k.f(reactApplicationContext, "reactContext");
        k.f(rNAdsNative, "mNative");
        this.reactContext = reactApplicationContext;
        this.mNative = rNAdsNative;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(reactApplicationContext);
        k.e(firebaseAnalytics, "getInstance(reactContext)");
        this.mAnalytics = firebaseAnalytics;
        AdCache adCache = new AdCache();
        this.nativeCache = adCache;
        AdCache adCache2 = new AdCache();
        this.nativeBannerCache = adCache2;
        i10 = h0.i(q.a(350, adCache), q.a(98, adCache2));
        this.cache = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cacheAd(java.lang.String r6, int r7, ie.d<? super ee.u> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$cacheAd$1
            if (r0 == 0) goto L13
            r0 = r8
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$cacheAd$1 r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$cacheAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$cacheAd$1 r0 = new com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$cacheAd$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = je.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ee.o.b(r8)
            goto L6a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ee.o.b(r8)
            timber.log.a$b r8 = timber.log.a.f37331a
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r6
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.b(r7)
            r2[r3] = r4
            java.lang.String r4 = "cacheAd %s, %d"
            r8.v(r4, r2)
            java.util.Map<java.lang.Integer, com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache> r8 = r5.cache
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.b(r7)
            java.lang.Object r8 = r8.get(r2)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache r8 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache) r8
            if (r8 != 0) goto L56
            goto L6a
        L56:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L6a
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r2 = new com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager
            r2.<init>(r5, r6, r7)
            r0.label = r3
            java.lang.Object r6 = r8.put(r2, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            ee.u r6 = ee.u.f29813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.cacheAd(java.lang.String, int, ie.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitRNEvent(int i10, String str, WritableMap writableMap) {
        ((RCTEventEmitter) this.reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(i10, str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void emitRNEvent$default(RNAdsNativeAdLoader rNAdsNativeAdLoader, int i10, String str, WritableMap writableMap, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            writableMap = null;
        }
        rNAdsNativeAdLoader.emitRNEvent(i10, str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getLoader(java.lang.String r6, int r7, ie.d<? super com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$getLoader$1
            if (r0 == 0) goto L13
            r0 = r8
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$getLoader$1 r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$getLoader$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$getLoader$1 r0 = new com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$getLoader$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = je.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r7 = r0.I$0
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.L$0
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader) r0
            ee.o.b(r8)
            goto L72
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            ee.o.b(r8)
            timber.log.a$b r8 = timber.log.a.f37331a
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r6
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.b(r7)
            r2[r3] = r4
            java.lang.String r4 = "getLoader %s, %d"
            r8.v(r4, r2)
            java.util.Map<java.lang.Integer, com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache> r8 = r5.cache
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.b(r7)
            java.lang.Object r8 = r8.get(r2)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache r8 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache) r8
            if (r8 != 0) goto L62
            r8 = 0
            r0 = r5
            goto L74
        L62:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.get(r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            r0 = r5
        L72:
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r8 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager) r8
        L74:
            if (r8 != 0) goto L7b
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r8 = new com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager
            r8.<init>(r0, r6, r7)
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.getLoader(java.lang.String, int, ie.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 getScope() {
        i lifecycle;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        androidx.appcompat.app.d dVar = currentActivity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) currentActivity : null;
        if (dVar == null || (lifecycle = dVar.getLifecycle()) == null) {
            return null;
        }
        return n.a(lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEvent(String str, Bundle bundle) {
        timber.log.a.f37331a.v("logEvent name: %s, params: %s", str, bundle);
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsNativeAdLoader$logEvent$1(this, str, bundle, null), 2, null);
    }

    private final void restoreLoader(RNAdsNativeManager rNAdsNativeManager) {
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, null, null, new RNAdsNativeAdLoader$restoreLoader$1(rNAdsNativeManager, this, null), 3, null);
    }

    public final void destroy() {
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, u1.f38661a, null, new RNAdsNativeAdLoader$destroy$1(this, null), 2, null);
    }

    public final void getLoaderAndBind(RNAdsNativeView rNAdsNativeView) {
        k.f(rNAdsNativeView, "view");
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, null, null, new RNAdsNativeAdLoader$getLoaderAndBind$1(rNAdsNativeView, this, null), 3, null);
    }

    public final void init(ReadableArray readableArray) {
        k.f(readableArray, "adUnits");
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsNativeAdLoader$init$1(readableArray, this, null), 2, null);
    }

    public final void unbindAndRestoreLoader(RNAdsNativeManager rNAdsNativeManager) {
        k.f(rNAdsNativeManager, "loader");
        rNAdsNativeManager.unbind();
        restoreLoader(rNAdsNativeManager);
    }
}
