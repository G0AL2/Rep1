package o9;

import java.util.Collections;
import java.util.List;

/* compiled from: HlsPlaylist.java */
/* loaded from: classes2.dex */
public abstract class i implements h9.a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final String f35131a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f35132b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f35133c;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(String str, List<String> list, boolean z10) {
        this.f35131a = str;
        this.f35132b = Collections.unmodifiableList(list);
        this.f35133c = z10;
    }
}
