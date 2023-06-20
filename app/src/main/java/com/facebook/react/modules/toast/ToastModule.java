package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import h6.e;
import java.util.HashMap;
import java.util.Map;

@o6.a(name = ToastModule.NAME)
/* loaded from: classes.dex */
public class ToastModule extends NativeToastAndroidSpec {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15649b;

        a(String str, int i10) {
            this.f15648a = str;
            this.f15649b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f15648a, this.f15649b).show();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15652b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15653c;

        b(String str, int i10, int i11) {
            this.f15651a = str;
            this.f15652b = i10;
            this.f15653c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f15651a, this.f15652b);
            makeText.setGravity(this.f15653c, 0, 0);
            makeText.show();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15656b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15657c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f15658d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f15659e;

        c(String str, int i10, int i11, int i12, int i13) {
            this.f15655a = str;
            this.f15656b = i10;
            this.f15657c = i11;
            this.f15658d = i12;
            this.f15659e = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f15655a, this.f15656b);
            makeText.setGravity(this.f15657c, this.f15658d, this.f15659e);
            makeText.show();
        }
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap b10 = e.b();
        b10.put(DURATION_SHORT_KEY, 0);
        b10.put(DURATION_LONG_KEY, 1);
        b10.put(GRAVITY_TOP_KEY, 49);
        b10.put(GRAVITY_BOTTOM_KEY, 81);
        b10.put(GRAVITY_CENTER, 17);
        return b10;
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(String str, double d10) {
        UiThreadUtil.runOnUiThread(new a(str, (int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(String str, double d10, double d11) {
        UiThreadUtil.runOnUiThread(new b(str, (int) d10, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(String str, double d10, double d11, double d12, double d13) {
        UiThreadUtil.runOnUiThread(new c(str, (int) d10, (int) d11, (int) d12, (int) d13));
    }
}
