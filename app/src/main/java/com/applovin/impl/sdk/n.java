package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n implements i.a {

    /* renamed from: a  reason: collision with root package name */
    private final m f8572a;

    /* renamed from: b  reason: collision with root package name */
    private Object f8573b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f8574c = new WeakReference<>(null);

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.i f8575d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.o f8576e;

    /* renamed from: f  reason: collision with root package name */
    private int f8577f;

    public n(m mVar) {
        this.f8572a = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View a(final Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(e());
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.sdk.n.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                n.this.a((Context) activity);
            }
        });
        if (com.applovin.impl.sdk.utils.g.d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        final String f10 = f();
        final WeakReference weakReference = new WeakReference(context);
        new AlertDialog.Builder(context).setTitle("Ad Info").setMessage(f10).setNegativeButton("Close", (DialogInterface.OnClickListener) null).setPositiveButton("Report", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.n.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    n.this.a(context2, f10);
                }
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        kVar.b("Describe your issue below:\n\n\n").a("Ad Info:").a(str).a("\nDebug Info:\n").a("Platform", "fireos".equals(this.f8572a.V().f()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f8572a.a(com.applovin.impl.sdk.c.b.dz)).a("Ad Review Version", e.a()).a("App Package Name", context.getPackageName()).a("Device", Build.DEVICE).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f8572a.o()).a(g());
        Intent intent = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", "MAX Ad Report").setPackage("com.google.android.gm");
        if (this.f8573b instanceof com.applovin.impl.sdk.ad.e) {
            intent.putExtra("android.intent.extra.SUBJECT", "AppLovin Ad Report");
            JSONObject originalFullResponse = ((com.applovin.impl.sdk.ad.e) this.f8573b).getOriginalFullResponse();
            Uri cacheTextWithFileName = AppLovinContentProviderUtils.cacheTextWithFileName(originalFullResponse.toString(), "ad_response.json");
            if (cacheTextWithFileName != null) {
                intent.putExtra("android.intent.extra.STREAM", cacheTextWithFileName);
            } else {
                kVar.a("\nAd Response:\n");
                kVar.a(originalFullResponse.toString());
            }
        }
        intent.putExtra("android.intent.extra.TEXT", kVar.toString());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setPackage(null);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f8572a.ae().b() && this.f8574c.get() == null) {
            Activity a10 = this.f8572a.af().a();
            if (a10 == null) {
                v A = this.f8572a.A();
                A.e("AppLovinSdk", "Failed to display creative debugger button for ad: " + this.f8573b);
                return;
            }
            View findViewById = a10.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                if (v.a()) {
                    v A2 = this.f8572a.A();
                    A2.b("AppLovinSdk", "Displaying creative debugger button for ad: " + this.f8573b);
                }
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a11 = a(a10);
                frameLayout.addView(a11);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a11.startAnimation(alphaAnimation);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.sdk.n.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (a11.getParent() == null) {
                            frameLayout.addView(a11);
                        }
                    }
                });
                this.f8574c = new WeakReference<>(a11);
            }
        }
    }

    private Drawable e() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    private String f() {
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        Object obj = this.f8573b;
        if (obj instanceof com.applovin.impl.sdk.ad.e) {
            com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) obj;
            kVar.a("Network", "APPLOVIN").a(eVar).b(eVar);
        } else if (obj instanceof com.applovin.impl.mediation.a.a) {
            kVar.a((com.applovin.impl.mediation.a.a) obj);
        }
        kVar.a(this.f8572a);
        kVar.a(g());
        return kVar.toString();
    }

    private Bundle g() {
        Bundle b10 = this.f8572a.B().b(Utils.getCurrentAdServeId(this.f8573b));
        if (b10 != null) {
            for (String str : b10.keySet()) {
                Object obj = b10.get(str);
                b10.remove(str);
                BundleUtils.put(StringUtils.toHumanReadableString(str), obj, b10);
            }
            return b10;
        }
        return null;
    }

    public void a() {
        com.applovin.impl.sdk.utils.i iVar = this.f8575d;
        if (iVar != null) {
            iVar.b();
        }
        this.f8573b = null;
        this.f8574c = new WeakReference<>(null);
    }

    public void a(Object obj) {
        if (com.applovin.impl.mediation.d.c.b(obj)) {
            return;
        }
        this.f8573b = obj;
        if (((Boolean) this.f8572a.a(com.applovin.impl.sdk.c.b.bH)).booleanValue() && this.f8572a.p().isCreativeDebuggerEnabled()) {
            if (this.f8575d == null) {
                this.f8575d = new com.applovin.impl.sdk.utils.i(this.f8572a, this);
            }
            this.f8575d.a();
        }
    }

    @Override // com.applovin.impl.sdk.utils.i.a
    public void b() {
        if (this.f8577f == 0) {
            this.f8576e = com.applovin.impl.sdk.utils.o.a(TimeUnit.SECONDS.toMillis(3L), this.f8572a, new Runnable() { // from class: com.applovin.impl.sdk.n.1
                @Override // java.lang.Runnable
                public void run() {
                    n.this.f8577f = 0;
                }
            });
        }
        int i10 = this.f8577f;
        if (i10 % 2 == 0) {
            this.f8577f = i10 + 1;
        }
    }

    @Override // com.applovin.impl.sdk.utils.i.a
    public void c() {
        int i10 = this.f8577f;
        if (i10 % 2 == 1) {
            this.f8577f = i10 + 1;
        }
        if (this.f8577f / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n.2
                @Override // java.lang.Runnable
                public void run() {
                    n.this.d();
                }
            });
            this.f8577f = 0;
            this.f8576e.d();
            this.f8575d.b();
        }
    }
}
