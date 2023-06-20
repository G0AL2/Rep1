package com.reactnativerate;

import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.c;
import com.google.android.play.core.review.d;
import gb.e;

@o6.a(name = RNRateModule.NAME)
/* loaded from: classes3.dex */
public class RNRateModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNRate";
    private final ReactApplicationContext reactContext;

    /* loaded from: classes3.dex */
    class a implements gb.a<ReviewInfo> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f28396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f28397b;

        /* renamed from: com.reactnativerate.RNRateModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0359a implements gb.a<Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f28399a;

            C0359a(e eVar) {
                this.f28399a = eVar;
            }

            @Override // gb.a
            public void a(e<Void> eVar) {
                if (this.f28399a.g()) {
                    a.this.f28396a.invoke(Boolean.TRUE);
                } else {
                    a.this.f28396a.invoke(Boolean.FALSE, "launchReviewFlow() unsuccessful");
                }
            }
        }

        a(Callback callback, c cVar) {
            this.f28396a = callback;
            this.f28397b = cVar;
        }

        @Override // gb.a
        public void a(e<ReviewInfo> eVar) {
            if (eVar.g()) {
                ReviewInfo e10 = eVar.e();
                Activity currentActivity = RNRateModule.this.getCurrentActivity();
                if (currentActivity == null) {
                    this.f28396a.invoke(Boolean.FALSE, "getCurrentActivity() unsuccessful");
                    return;
                } else {
                    this.f28397b.b(currentActivity, e10).a(new C0359a(eVar));
                    return;
                }
            }
            this.f28396a.invoke(Boolean.FALSE, "requestReviewFlow() unsuccessful");
        }
    }

    public RNRateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void rate(ReadableMap readableMap, Callback callback) {
        c a10 = d.a(this.reactContext);
        a10.a().a(new a(callback, a10));
    }
}
