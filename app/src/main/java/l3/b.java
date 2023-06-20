package l3;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import org.json.JSONObject;

/* compiled from: VideoInfo.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f33666a;

    /* renamed from: b  reason: collision with root package name */
    private int f33667b;

    /* renamed from: c  reason: collision with root package name */
    private long f33668c;

    /* renamed from: d  reason: collision with root package name */
    private double f33669d;

    /* renamed from: e  reason: collision with root package name */
    private String f33670e;

    /* renamed from: f  reason: collision with root package name */
    private String f33671f;

    /* renamed from: g  reason: collision with root package name */
    private String f33672g;

    /* renamed from: h  reason: collision with root package name */
    private String f33673h;

    /* renamed from: i  reason: collision with root package name */
    private String f33674i;

    /* renamed from: j  reason: collision with root package name */
    private String f33675j;

    /* renamed from: k  reason: collision with root package name */
    private int f33676k;

    /* renamed from: l  reason: collision with root package name */
    private int f33677l;

    /* renamed from: m  reason: collision with root package name */
    private int f33678m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f33679n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f33680o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f33681p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f33682q = 307200;

    public String A() {
        return this.f33673h;
    }

    public String B() {
        return this.f33674i;
    }

    public String C() {
        if (TextUtils.isEmpty(this.f33675j)) {
            this.f33675j = o3.b.a(this.f33672g);
        }
        return this.f33675j;
    }

    public int D() {
        if (this.f33682q < 0) {
            this.f33682q = 307200;
        }
        long j10 = this.f33668c;
        if (this.f33682q > j10) {
            this.f33682q = (int) j10;
        }
        return this.f33682q;
    }

    public int E() {
        return this.f33680o;
    }

    public int F() {
        return this.f33681p;
    }

    public JSONObject G() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", f());
            jSONObject.put("cover_url", w());
            jSONObject.put("cover_width", i());
            jSONObject.put("endcard", A());
            jSONObject.put("file_hash", C());
            jSONObject.put("resolution", u());
            jSONObject.put("size", o());
            jSONObject.put("video_duration", r());
            jSONObject.put(InneractiveRichMediaVideoPlayerActivityCore.VIDEO_URL, y());
            jSONObject.put("playable_download_url", B());
            jSONObject.put("if_playable_loading_show", H());
            jSONObject.put("remove_loading_page_type", I());
            jSONObject.put("fallback_endcard_judge", a());
            jSONObject.put("video_preload_size", D());
            jSONObject.put("reward_video_cached_type", E());
            jSONObject.put("execute_cached_type", F());
            jSONObject.put("endcard_render", l());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int H() {
        return this.f33678m;
    }

    public int I() {
        return this.f33679n;
    }

    public boolean J() {
        return this.f33681p == 1;
    }

    public boolean K() {
        return this.f33680o == 0;
    }

    public int a() {
        return this.f33676k;
    }

    public void b(double d10) {
        this.f33669d = d10;
    }

    public void c(int i10) {
        this.f33676k = i10;
    }

    public void d(long j10) {
        this.f33668c = j10;
    }

    public void e(String str) {
        this.f33670e = str;
    }

    public int f() {
        return this.f33666a;
    }

    public void g(int i10) {
        this.f33666a = i10;
    }

    public void h(String str) {
        this.f33671f = str;
    }

    public int i() {
        return this.f33667b;
    }

    public void j(int i10) {
        this.f33667b = i10;
    }

    public void k(String str) {
        this.f33672g = str;
    }

    public int l() {
        return this.f33677l;
    }

    public void m(int i10) {
        this.f33677l = i10;
    }

    public void n(String str) {
        this.f33673h = str;
    }

    public long o() {
        return this.f33668c;
    }

    public void p(int i10) {
        this.f33682q = i10;
    }

    public void q(String str) {
        this.f33674i = str;
    }

    public double r() {
        return this.f33669d;
    }

    public void s(int i10) {
        this.f33680o = i10;
    }

    public void t(String str) {
        this.f33675j = str;
    }

    public String u() {
        return this.f33670e;
    }

    public void v(int i10) {
        this.f33681p = i10;
    }

    public String w() {
        return this.f33671f;
    }

    public void x(int i10) {
        this.f33678m = i10;
    }

    public String y() {
        return this.f33672g;
    }

    public void z(int i10) {
        this.f33679n = i10;
    }
}
