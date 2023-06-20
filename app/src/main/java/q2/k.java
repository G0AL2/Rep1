package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NetworkResponse.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f35809a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f35810b;

    /* renamed from: c  reason: collision with root package name */
    public final List<g> f35811c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f35812d;

    @Deprecated
    public k(int i10, byte[] bArr, Map<String, String> map, boolean z10, long j10) {
        this(i10, bArr, map, a(map), z10, j10);
    }

    private static List<g> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> b(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    public k(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, b(list), list, z10, j10);
    }

    @Deprecated
    public k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private k(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f35809a = bArr;
        this.f35810b = map;
        if (list == null) {
            this.f35811c = null;
        } else {
            this.f35811c = Collections.unmodifiableList(list);
        }
        this.f35812d = z10;
    }
}
