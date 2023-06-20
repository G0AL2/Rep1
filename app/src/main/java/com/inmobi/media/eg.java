package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.inmobi.media.ec;
import com.inmobi.media.ei;
import com.inmobi.media.fq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: NativeAdTracker.java */
/* loaded from: classes3.dex */
public class eg {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25229b = "eg";

    /* renamed from: g  reason: collision with root package name */
    private boolean f25234g;

    /* renamed from: h  reason: collision with root package name */
    private byte f25235h;

    /* renamed from: a  reason: collision with root package name */
    static final Map<Context, ec> f25228a = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Context, ei> f25230c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<View, a> f25231d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ec.a f25232e = new ec.a() { // from class: com.inmobi.media.eg.1
        @Override // com.inmobi.media.ec.a
        public final void a(View view, Object obj) {
            ((n) obj).a(view);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static final ei.a f25233f = new ei.a() { // from class: com.inmobi.media.eg.2

        /* renamed from: a  reason: collision with root package name */
        private final Rect f25236a = new Rect();

        @Override // com.inmobi.media.ei.a
        public final boolean a(View view, View view2, int i10) {
            return true;
        }

        @Override // com.inmobi.media.ei.a
        public final boolean a(View view, View view2, int i10, Object obj) {
            fd mediaPlayer;
            if ((obj instanceof n) && !((n) obj).f25905j) {
                if ((!(view2 instanceof fj) || (mediaPlayer = ((fj) view2).getMediaPlayer()) == null || 3 == mediaPlayer.f25381a) && view2 != null && view != null && view2.isShown() && view.getParent() != null && view2.getGlobalVisibleRect(this.f25236a)) {
                    long height = this.f25236a.height() * this.f25236a.width();
                    long width = view.getWidth() * view.getHeight();
                    return width > 0 && height * 100 >= ((long) i10) * width;
                }
                return false;
            }
            return false;
        }
    };

    /* compiled from: NativeAdTracker.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(View view, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public eg(byte b10) {
        this.f25235h = b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        ec ecVar = f25228a.get(context);
        if (ecVar != null) {
            ecVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context) {
        ec ecVar = f25228a.get(context);
        if (ecVar != null) {
            ecVar.a();
        }
    }

    private void d(Context context) {
        Map<Context, ei> map = f25230c;
        ei remove = map.remove(context);
        if (remove != null) {
            remove.e();
        }
        if ((context instanceof Activity) && map.isEmpty() && this.f25234g) {
            this.f25234g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, View view, n nVar, fq.m mVar) {
        ec a10 = a(context, mVar);
        if (this.f25235h != 0) {
            a10.a(view, nVar, mVar.impressionMinPercentageViewed, mVar.impressionMinTimeViewed);
            return;
        }
        fq.l lVar = mVar.video;
        a10.a(view, nVar, lVar.impressionMinPercentageViewed, lVar.impressionMinTimeViewed);
    }

    private ec a(Context context, fq.m mVar) {
        Map<Context, ec> map = f25228a;
        ec ecVar = map.get(context);
        if (ecVar == null) {
            if (context instanceof Activity) {
                ecVar = new ec(mVar, new ea(f25233f, (Activity) context), f25232e);
                if (!this.f25234g) {
                    this.f25234g = true;
                }
            } else {
                ecVar = new ec(mVar, new eh(f25233f, mVar, (byte) 1), f25232e);
            }
            map.put(context, ecVar);
        }
        return ecVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, n nVar) {
        ec ecVar = f25228a.get(context);
        if (ecVar != null) {
            ecVar.a(nVar);
            if (ecVar.c()) {
                return;
            }
            a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context) {
        Map<Context, ec> map = f25228a;
        ec remove = map.remove(context);
        if (remove != null) {
            remove.d();
        }
        if ((context instanceof Activity) && map.isEmpty() && this.f25234g) {
            this.f25234g = false;
        }
    }

    public final void a(Context context, View view, n nVar) {
        ei eiVar = f25230c.get(context);
        if (eiVar != null) {
            eiVar.a(nVar);
            if (!eiVar.g()) {
                d(context);
            }
        }
        f25231d.remove(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, View view, n nVar, a aVar, fq.m mVar) {
        ei ehVar;
        Map<Context, ei> map = f25230c;
        ei eiVar = map.get(context);
        if (eiVar == null) {
            boolean z10 = context instanceof Activity;
            if (z10) {
                ehVar = new ea(f25233f, (Activity) context);
            } else {
                ehVar = new eh(f25233f, mVar, (byte) 1);
            }
            ehVar.f25241c = new ei.c() { // from class: com.inmobi.media.eg.3
                @Override // com.inmobi.media.ei.c
                public final void a(List<View> list, List<View> list2) {
                    for (View view2 : list) {
                        a aVar2 = (a) eg.f25231d.get(view2);
                        if (aVar2 != null) {
                            aVar2.a(view2, true);
                        }
                    }
                    for (View view3 : list2) {
                        a aVar3 = (a) eg.f25231d.get(view3);
                        if (aVar3 != null) {
                            aVar3.a(view3, false);
                        }
                    }
                }
            };
            map.put(context, ehVar);
            if (z10 && !this.f25234g) {
                this.f25234g = true;
            }
            eiVar = ehVar;
        }
        f25231d.put(view, aVar);
        if (this.f25235h != 0) {
            eiVar.a(view, nVar, mVar.displayMinPercentageAnimate);
        } else {
            eiVar.a(view, nVar, mVar.video.videoMinPercentagePlay);
        }
    }
}
