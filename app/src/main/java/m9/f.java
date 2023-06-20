package m9;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* compiled from: EventStream.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final EventMessage[] f34362a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f34363b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34364c;

    /* renamed from: d  reason: collision with root package name */
    public final String f34365d;

    public f(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        this.f34364c = str;
        this.f34365d = str2;
        this.f34363b = jArr;
        this.f34362a = eventMessageArr;
    }

    public String a() {
        String str = this.f34364c;
        String str2 = this.f34365d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        return sb2.toString();
    }
}
