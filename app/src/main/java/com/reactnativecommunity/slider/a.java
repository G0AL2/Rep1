package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.y;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* compiled from: ReactSlider.java */
/* loaded from: classes3.dex */
public class a extends y {

    /* renamed from: j  reason: collision with root package name */
    private static int f28321j = 128;

    /* renamed from: b  reason: collision with root package name */
    private double f28322b;

    /* renamed from: c  reason: collision with root package name */
    private double f28323c;

    /* renamed from: d  reason: collision with root package name */
    private double f28324d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28325e;

    /* renamed from: f  reason: collision with root package name */
    private double f28326f;

    /* renamed from: g  reason: collision with root package name */
    private double f28327g;

    /* renamed from: h  reason: collision with root package name */
    private String f28328h;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f28329i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactSlider.java */
    /* renamed from: com.reactnativecommunity.slider.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0358a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f28330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccessibilityEvent f28331b;

        C0358a(a aVar, AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
            this.f28330a = accessibilityManager;
            this.f28331b = accessibilityEvent;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f28330a.sendAccessibilityEvent(this.f28331b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactSlider.java */
    /* loaded from: classes3.dex */
    public class b implements Callable<BitmapDrawable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28332a;

        b(String str) {
            this.f28332a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BitmapDrawable call() {
            Bitmap decodeStream;
            try {
                if (!this.f28332a.startsWith("http://") && !this.f28332a.startsWith("https://") && !this.f28332a.startsWith("file://") && !this.f28332a.startsWith("asset://") && !this.f28332a.startsWith("data:")) {
                    decodeStream = BitmapFactory.decodeResource(a.this.getResources(), a.this.getResources().getIdentifier(this.f28332a, "drawable", a.this.getContext().getPackageName()));
                    return new BitmapDrawable(a.this.getResources(), decodeStream);
                }
                decodeStream = BitmapFactory.decodeStream(new URL(this.f28332a).openStream());
                return new BitmapDrawable(a.this.getResources(), decodeStream);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28322b = 0.0d;
        this.f28323c = 0.0d;
        this.f28324d = 0.0d;
        this.f28325e = false;
        this.f28326f = 0.0d;
        this.f28327g = 0.0d;
        a();
    }

    private void a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || i10 >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    private BitmapDrawable b(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new b(str)).get();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void f() {
        if (this.f28326f == 0.0d) {
            this.f28327g = (this.f28323c - this.f28322b) / f28321j;
        }
        setMax(getTotalSteps());
        g();
    }

    private void g() {
        double d10 = this.f28324d;
        double d11 = this.f28322b;
        setProgress((int) Math.round(((d10 - d11) / (this.f28323c - d11)) * getTotalSteps()));
    }

    private double getStepValue() {
        double d10 = this.f28326f;
        return d10 > 0.0d ? d10 : this.f28327g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f28323c - this.f28322b) / getStepValue());
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(a.class.getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            new Timer().schedule(new C0358a(this, accessibilityManager, obtain), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
        this.f28325e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f28325e;
    }

    public double e(int i10) {
        if (i10 == getMax()) {
            return this.f28323c;
        }
        return (i10 * getStepValue()) + this.f28322b;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT >= 21) {
            if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
                setupAccessibility((int) this.f28324d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityIncrements(List<String> list) {
        this.f28329i = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityUnits(String str) {
        this.f28328h = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d10) {
        this.f28323c = d10;
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d10) {
        this.f28322b = d10;
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d10) {
        this.f28326f = d10;
        f();
    }

    public void setThumbImage(String str) {
        if (str != null) {
            setThumb(b(str));
            if (Build.VERSION.SDK_INT >= 21) {
                setSplitTrack(false);
                return;
            }
            return;
        }
        setThumb(getThumb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d10) {
        this.f28324d = d10;
        g();
    }

    public void setupAccessibility(int i10) {
        List<String> list;
        if (this.f28328h == null || (list = this.f28329i) == null || list.size() - 1 != ((int) this.f28323c)) {
            return;
        }
        String str = this.f28329i.get(i10);
        int length = this.f28328h.length();
        String str2 = this.f28328h;
        if (str != null && Integer.parseInt(str) == 1) {
            str2 = str2.substring(0, length - 1);
        }
        announceForAccessibility(String.format("%s %s", str, str2));
    }
}
