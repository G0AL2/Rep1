package o9;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import j8.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: HlsMultivariantPlaylist.java */
/* loaded from: classes2.dex */
public class h extends i {

    /* renamed from: n  reason: collision with root package name */
    public static final h f35111n = new h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f35112d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f35113e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f35114f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f35115g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f35116h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f35117i;

    /* renamed from: j  reason: collision with root package name */
    public final p1 f35118j;

    /* renamed from: k  reason: collision with root package name */
    public final List<p1> f35119k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f35120l;

    /* renamed from: m  reason: collision with root package name */
    public final List<DrmInitData> f35121m;

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f35122a;

        /* renamed from: b  reason: collision with root package name */
        public final p1 f35123b;

        /* renamed from: c  reason: collision with root package name */
        public final String f35124c;

        public a(Uri uri, p1 p1Var, String str, String str2) {
            this.f35122a = uri;
            this.f35123b = p1Var;
            this.f35124c = str2;
        }
    }

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f35125a;

        /* renamed from: b  reason: collision with root package name */
        public final p1 f35126b;

        /* renamed from: c  reason: collision with root package name */
        public final String f35127c;

        /* renamed from: d  reason: collision with root package name */
        public final String f35128d;

        /* renamed from: e  reason: collision with root package name */
        public final String f35129e;

        /* renamed from: f  reason: collision with root package name */
        public final String f35130f;

        public b(Uri uri, p1 p1Var, String str, String str2, String str3, String str4) {
            this.f35125a = uri;
            this.f35126b = p1Var;
            this.f35127c = str;
            this.f35128d = str2;
            this.f35129e = str3;
            this.f35130f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new p1.b().S("0").K("application/x-mpegURL").E(), null, null, null, null);
        }

        public b a(p1 p1Var) {
            return new b(this.f35125a, p1Var, this.f35127c, this.f35128d, this.f35129e, this.f35130f);
        }
    }

    public h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, p1 p1Var, List<p1> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        this.f35112d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f35113e = Collections.unmodifiableList(list2);
        this.f35114f = Collections.unmodifiableList(list3);
        this.f35115g = Collections.unmodifiableList(list4);
        this.f35116h = Collections.unmodifiableList(list5);
        this.f35117i = Collections.unmodifiableList(list6);
        this.f35118j = p1Var;
        this.f35119k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f35120l = Collections.unmodifiableMap(map);
        this.f35121m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f35122a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = list2.get(i12);
                    if (streamKey.f21272b == i10 && streamKey.f21273c == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        return new h("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f35125a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // h9.a
    /* renamed from: c */
    public h a(List<StreamKey> list) {
        return new h(this.f35131a, this.f35132b, d(this.f35113e, 0, list), Collections.emptyList(), d(this.f35115g, 1, list), d(this.f35116h, 2, list), Collections.emptyList(), this.f35118j, this.f35119k, this.f35133c, this.f35120l, this.f35121m);
    }
}
