package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
class j implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2554a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f2555b;

    /* renamed from: c  reason: collision with root package name */
    private final i.e f2556c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f2557d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f2558e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f2559f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f2560g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f2561h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f2562i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(i.e eVar) {
        int i10;
        Icon icon;
        List<String> list;
        List<String> e10;
        this.f2556c = eVar;
        this.f2554a = eVar.f2524a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f2555b = new Notification.Builder(eVar.f2524a, eVar.K);
        } else {
            this.f2555b = new Notification.Builder(eVar.f2524a);
        }
        Notification notification = eVar.S;
        this.f2555b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2532i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f2528e).setContentText(eVar.f2529f).setContentInfo(eVar.f2534k).setContentIntent(eVar.f2530g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f2531h, (notification.flags & 128) != 0).setLargeIcon(eVar.f2533j).setNumber(eVar.f2535l).setProgress(eVar.f2543t, eVar.f2544u, eVar.f2545v);
        if (i11 < 21) {
            this.f2555b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i11 >= 16) {
            this.f2555b.setSubText(eVar.f2540q).setUsesChronometer(eVar.f2538o).setPriority(eVar.f2536m);
            Iterator<i.a> it = eVar.f2525b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = eVar.D;
            if (bundle != null) {
                this.f2560g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f2549z) {
                    this.f2560g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f2546w;
                if (str != null) {
                    this.f2560g.putString("android.support.groupKey", str);
                    if (eVar.f2547x) {
                        this.f2560g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2560g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f2548y;
                if (str2 != null) {
                    this.f2560g.putString("android.support.sortKey", str2);
                }
            }
            this.f2557d = eVar.H;
            this.f2558e = eVar.I;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 17) {
            this.f2555b.setShowWhen(eVar.f2537n);
        }
        if (i12 >= 19 && i12 < 21 && (e10 = e(g(eVar.f2526c), eVar.V)) != null && !e10.isEmpty()) {
            this.f2560g.putStringArray("android.people", (String[]) e10.toArray(new String[e10.size()]));
        }
        if (i12 >= 20) {
            this.f2555b.setLocalOnly(eVar.f2549z).setGroup(eVar.f2546w).setGroupSummary(eVar.f2547x).setSortKey(eVar.f2548y);
            this.f2561h = eVar.O;
        }
        if (i12 >= 21) {
            this.f2555b.setCategory(eVar.C).setColor(eVar.E).setVisibility(eVar.F).setPublicVersion(eVar.G).setSound(notification.sound, notification.audioAttributes);
            if (i12 < 28) {
                list = e(g(eVar.f2526c), eVar.V);
            } else {
                list = eVar.V;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.f2555b.addPerson(str3);
                }
            }
            this.f2562i = eVar.J;
            if (eVar.f2527d.size() > 0) {
                Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i13 = 0; i13 < eVar.f2527d.size(); i13++) {
                    bundle4.putBundle(Integer.toString(i13), k.b(eVar.f2527d.get(i13)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2560g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (icon = eVar.U) != null) {
            this.f2555b.setSmallIcon(icon);
        }
        if (i14 >= 24) {
            this.f2555b.setExtras(eVar.D).setRemoteInputHistory(eVar.f2542s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                this.f2555b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                this.f2555b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                this.f2555b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i14 >= 26) {
            this.f2555b.setBadgeIconType(eVar.L).setSettingsText(eVar.f2541r).setShortcutId(eVar.M).setTimeoutAfter(eVar.N).setGroupAlertBehavior(eVar.O);
            if (eVar.B) {
                this.f2555b.setColorized(eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f2555b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<m> it2 = eVar.f2526c.iterator();
            while (it2.hasNext()) {
                this.f2555b.addPerson(it2.next().h());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            this.f2555b.setAllowSystemGeneratedContextualActions(eVar.Q);
            this.f2555b.setBubbleMetadata(i.d.a(eVar.R));
        }
        if (e0.a.c() && (i10 = eVar.P) != 0) {
            this.f2555b.setForegroundServiceBehavior(i10);
        }
        if (eVar.T) {
            if (this.f2556c.f2547x) {
                this.f2561h = 2;
            } else {
                this.f2561h = 1;
            }
            this.f2555b.setVibrate(null);
            this.f2555b.setSound(null);
            int i16 = notification.defaults & (-2);
            notification.defaults = i16;
            int i17 = i16 & (-3);
            notification.defaults = i17;
            this.f2555b.setDefaults(i17);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f2556c.f2546w)) {
                    this.f2555b.setGroup("silent");
                }
                this.f2555b.setGroupAlertBehavior(this.f2561h);
            }
        }
    }

    private void b(i.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 20) {
            if (i10 >= 16) {
                this.f2559f.add(k.f(this.f2555b, aVar));
                return;
            }
            return;
        }
        IconCompat e10 = aVar.e();
        if (i10 >= 23) {
            builder = new Notification.Action.Builder(e10 != null ? e10.p() : null, aVar.i(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(e10 != null ? e10.e() : 0, aVar.i(), aVar.a());
        }
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : n.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i11 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i11 >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.f2555b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<m> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (m mVar : list) {
            arrayList.add(mVar.g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i10 = notification.defaults & (-2);
        notification.defaults = i10;
        notification.defaults = i10 & (-3);
    }

    @Override // androidx.core.app.h
    public Notification.Builder a() {
        return this.f2555b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        i.f fVar = this.f2556c.f2539p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e10 = fVar != null ? fVar.e(this) : null;
        Notification d11 = d();
        if (e10 != null) {
            d11.contentView = e10;
        } else {
            RemoteViews remoteViews = this.f2556c.H;
            if (remoteViews != null) {
                d11.contentView = remoteViews;
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 16 && fVar != null && (d10 = fVar.d(this)) != null) {
            d11.bigContentView = d10;
        }
        if (i10 >= 21 && fVar != null && (f10 = this.f2556c.f2539p.f(this)) != null) {
            d11.headsUpContentView = f10;
        }
        if (i10 >= 16 && fVar != null && (a10 = i.a(d11)) != null) {
            fVar.a(a10);
        }
        return d11;
    }

    protected Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f2555b.build();
        }
        if (i10 >= 24) {
            Notification build = this.f2555b.build();
            if (this.f2561h != 0) {
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2561h == 2) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2561h == 1) {
                    h(build);
                }
            }
            return build;
        } else if (i10 >= 21) {
            this.f2555b.setExtras(this.f2560g);
            Notification build2 = this.f2555b.build();
            RemoteViews remoteViews = this.f2557d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2558e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2562i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2561h != 0) {
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2561h == 2) {
                    h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2561h == 1) {
                    h(build2);
                }
            }
            return build2;
        } else if (i10 >= 20) {
            this.f2555b.setExtras(this.f2560g);
            Notification build3 = this.f2555b.build();
            RemoteViews remoteViews4 = this.f2557d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2558e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2561h != 0) {
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2561h == 2) {
                    h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2561h == 1) {
                    h(build3);
                }
            }
            return build3;
        } else if (i10 >= 19) {
            SparseArray<Bundle> a10 = k.a(this.f2559f);
            if (a10 != null) {
                this.f2560g.putSparseParcelableArray("android.support.actionExtras", a10);
            }
            this.f2555b.setExtras(this.f2560g);
            Notification build4 = this.f2555b.build();
            RemoteViews remoteViews6 = this.f2557d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2558e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i10 >= 16) {
            Notification build5 = this.f2555b.build();
            Bundle a11 = i.a(build5);
            Bundle bundle = new Bundle(this.f2560g);
            for (String str : this.f2560g.keySet()) {
                if (a11.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a11.putAll(bundle);
            SparseArray<Bundle> a12 = k.a(this.f2559f);
            if (a12 != null) {
                i.a(build5).putSparseParcelableArray("android.support.actionExtras", a12);
            }
            RemoteViews remoteViews8 = this.f2557d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2558e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        } else {
            return this.f2555b.getNotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f2554a;
    }
}
