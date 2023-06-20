package com.bytedance.sdk.component.a;

import android.net.Uri;
import com.bytedance.sdk.component.a.k;
import com.bytedance.sdk.component.a.v;
import com.bytedance.sdk.component.a.w;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PermissionChecker.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f9287a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f9288b;

    /* renamed from: c  reason: collision with root package name */
    private final w f9289c = r.f9275a;

    /* renamed from: d  reason: collision with root package name */
    private final v f9290d;

    /* renamed from: e  reason: collision with root package name */
    private k.b f9291e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar, Set<String> set, Set<String> set2) {
        this.f9290d = vVar;
        if (set != null && !set.isEmpty()) {
            this.f9287a = new LinkedHashSet(set);
        } else {
            this.f9287a = new LinkedHashSet();
        }
        if (set2 != null && !set2.isEmpty()) {
            this.f9288b = new LinkedHashSet(set2);
        } else {
            this.f9288b = new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized x a(boolean z10, String str, b bVar) throws v.a {
        x b10;
        k.b bVar2;
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null) {
            return null;
        }
        x xVar = this.f9288b.contains(bVar.a()) ? x.PUBLIC : null;
        for (String str2 : this.f9287a) {
            if (!parse.getHost().equals(str2)) {
                if (host.endsWith("." + str2)) {
                }
            }
            xVar = x.PRIVATE;
        }
        if (xVar == null && (bVar2 = this.f9291e) != null && bVar2.a(str)) {
            if (this.f9291e.a(str, bVar.a())) {
                return null;
            }
            xVar = x.PRIVATE;
        }
        if (z10) {
            b10 = a(str, bVar);
        } else {
            b10 = b(str, bVar);
        }
        return b10 != null ? b10 : xVar;
    }

    final synchronized x b(String str, b bVar) {
        return a(str, bVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(w.a aVar) {
        w wVar = this.f9289c;
        if (wVar != null) {
            wVar.b(aVar);
        }
    }

    final synchronized x a(String str, b bVar) throws v.a {
        return a(str, bVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(k.b bVar) {
        this.f9291e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(w.a aVar) {
        w wVar = this.f9289c;
        if (wVar != null) {
            wVar.a(aVar);
        }
    }

    private x a(String str, b bVar, boolean z10) {
        v vVar;
        if (!z10 || (vVar = this.f9290d) == null) {
            return null;
        }
        v.c a10 = vVar.a(str, this.f9287a);
        if (a10.f9305c.contains(bVar.a())) {
            return null;
        }
        if (a10.f9304b.contains(bVar.a())) {
            return x.PRIVATE;
        }
        if (a10.f9303a.compareTo(bVar.b()) < 0) {
            return null;
        }
        return a10.f9303a;
    }
}
