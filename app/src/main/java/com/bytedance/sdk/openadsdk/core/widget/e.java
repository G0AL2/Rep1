package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: VideoTrafficTipLayout.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private View f13163a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f13164b;

    /* renamed from: c  reason: collision with root package name */
    private Context f13165c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.video.nativevideo.a f13166d;

    /* renamed from: e  reason: collision with root package name */
    private b f13167e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13168f = false;

    /* renamed from: g  reason: collision with root package name */
    private l3.b f13169g;

    /* renamed from: h  reason: collision with root package name */
    private ViewStub f13170h;

    /* renamed from: i  reason: collision with root package name */
    private View f13171i;

    /* compiled from: VideoTrafficTipLayout.java */
    /* loaded from: classes.dex */
    public enum a {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* compiled from: VideoTrafficTipLayout.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean j();

        void l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f13165c == null) {
            return;
        }
        d();
    }

    private void d() {
        View view = this.f13163a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void b() {
        this.f13169g = null;
    }

    public void a(Context context, View view) {
        if (context == null || !(view instanceof ViewGroup)) {
            return;
        }
        this.f13171i = view;
        this.f13165c = m.a().getApplicationContext();
        this.f13170h = (ViewStub) LayoutInflater.from(context).inflate(t.f(context, "tt_video_traffic_tip"), (ViewGroup) view, true).findViewById(t.e(context, "tt_video_traffic_tip_layout_viewStub"));
    }

    private void a(Context context, View view, boolean z10) {
        ViewStub viewStub;
        if (context == null || view == null || (viewStub = this.f13170h) == null || viewStub.getParent() == null || this.f13163a != null) {
            return;
        }
        this.f13170h.inflate();
        this.f13163a = view.findViewById(t.e(context, "tt_video_traffic_tip_layout"));
        this.f13164b = (TextView) view.findViewById(t.e(context, "tt_video_traffic_tip_tv"));
        View findViewById = view.findViewById(t.e(context, "tt_video_traffic_continue_play_btn"));
        if (z10) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.e.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    e.this.c();
                    if (e.this.f13166d != null) {
                        e.this.f13166d.a(a.START_VIDEO, (String) null);
                    }
                }
            });
            return;
        }
        findViewById.setOnClickListener(null);
        findViewById.setClickable(false);
    }

    public void a(com.bytedance.sdk.openadsdk.core.video.nativevideo.a aVar, b bVar) {
        this.f13167e = bVar;
        this.f13166d = aVar;
    }

    public boolean a(int i10, l3.b bVar, boolean z10) {
        Context context = this.f13165c;
        if (context == null || bVar == null) {
            return true;
        }
        a(context, this.f13171i, z10);
        this.f13169g = bVar;
        if (i10 == 1 || i10 == 2) {
            return a(i10);
        }
        return true;
    }

    private boolean a(int i10) {
        b bVar;
        if (a() || this.f13168f) {
            return true;
        }
        if (this.f13166d != null && (bVar = this.f13167e) != null) {
            if (bVar.j()) {
                this.f13166d.e(null, null);
            }
            this.f13166d.a(a.PAUSE_VIDEO, (String) null);
        }
        a(this.f13169g, true);
        return false;
    }

    public void a(boolean z10) {
        if (z10) {
            b();
        }
        d();
    }

    public boolean a() {
        View view = this.f13163a;
        return view != null && view.getVisibility() == 0;
    }

    private void a(l3.b bVar, boolean z10) {
        View view;
        String str;
        View view2;
        if (bVar == null || (view = this.f13163a) == null || this.f13165c == null || view.getVisibility() == 0) {
            return;
        }
        b bVar2 = this.f13167e;
        if (bVar2 != null) {
            bVar2.l();
        }
        double ceil = Math.ceil((bVar.o() * 1.0d) / 1048576.0d);
        if (z10) {
            str = String.format(t.a(this.f13165c, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = t.a(this.f13165c, "tt_video_without_wifi_tips") + t.a(this.f13165c, "tt_video_bytesize");
        }
        v.a(this.f13163a, 0);
        v.a(this.f13164b, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!v.d(this.f13163a) || (view2 = this.f13163a) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
