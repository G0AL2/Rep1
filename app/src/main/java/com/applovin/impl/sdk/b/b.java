package com.applovin.impl.sdk.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.m;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final m f8146a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f8147b;

    /* renamed from: c  reason: collision with root package name */
    private AlertDialog f8148c;

    /* renamed from: d  reason: collision with root package name */
    private a f8149d;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public b(Activity activity, m mVar) {
        this.f8146a = mVar;
        this.f8147b = activity;
    }

    public void a() {
        this.f8147b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f8148c != null) {
                    b.this.f8148c.dismiss();
                }
            }
        });
    }

    public void a(final e eVar, final Runnable runnable) {
        this.f8147b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(b.this.f8147b);
                builder.setTitle(eVar.an());
                String ao = eVar.ao();
                if (AppLovinSdkUtils.isValidString(ao)) {
                    builder.setMessage(ao);
                }
                builder.setPositiveButton(eVar.ap(), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                builder.setCancelable(false);
                b.this.f8148c = builder.show();
            }
        });
    }

    public void a(a aVar) {
        this.f8149d = aVar;
    }

    public void b() {
        this.f8147b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f8148c = new AlertDialog.Builder(b.this.f8147b).setTitle((CharSequence) b.this.f8146a.a(com.applovin.impl.sdk.c.b.bv)).setMessage((CharSequence) b.this.f8146a.a(com.applovin.impl.sdk.c.b.bw)).setCancelable(false).setPositiveButton((CharSequence) b.this.f8146a.a(com.applovin.impl.sdk.c.b.by), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        b.this.f8149d.a();
                    }
                }).setNegativeButton((CharSequence) b.this.f8146a.a(com.applovin.impl.sdk.c.b.bx), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        b.this.f8149d.b();
                    }
                }).show();
            }
        });
    }

    public boolean c() {
        AlertDialog alertDialog = this.f8148c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
