package q5;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.google.android.gms.common.api.Api;
import q5.c;

/* compiled from: ImageDecodeOptionsBuilder.java */
/* loaded from: classes.dex */
public class c<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    private int f35929a = 100;

    /* renamed from: b  reason: collision with root package name */
    private int f35930b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: c  reason: collision with root package name */
    private boolean f35931c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35932d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f35933e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f35934f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap.Config f35935g;

    /* renamed from: h  reason: collision with root package name */
    private Bitmap.Config f35936h;

    /* renamed from: i  reason: collision with root package name */
    private u5.c f35937i;

    /* renamed from: j  reason: collision with root package name */
    private e6.a f35938j;

    /* renamed from: k  reason: collision with root package name */
    private ColorSpace f35939k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35940l;

    public c() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f35935g = config;
        this.f35936h = config;
    }

    public b a() {
        return new b(this);
    }

    public Bitmap.Config b() {
        return this.f35936h;
    }

    public Bitmap.Config c() {
        return this.f35935g;
    }

    public e6.a d() {
        return this.f35938j;
    }

    public ColorSpace e() {
        return this.f35939k;
    }

    public u5.c f() {
        return this.f35937i;
    }

    public boolean g() {
        return this.f35933e;
    }

    public boolean h() {
        return this.f35931c;
    }

    public boolean i() {
        return this.f35940l;
    }

    public boolean j() {
        return this.f35934f;
    }

    public int k() {
        return this.f35930b;
    }

    public int l() {
        return this.f35929a;
    }

    public boolean m() {
        return this.f35932d;
    }
}
