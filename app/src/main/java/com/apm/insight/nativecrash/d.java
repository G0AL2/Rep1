package com.apm.insight.nativecrash;

import com.apm.insight.l.o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class d {

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f6536i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f6537j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f6538k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f6539l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f6540m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a  reason: collision with root package name */
    private String f6541a;

    /* renamed from: b  reason: collision with root package name */
    private String f6542b;

    /* renamed from: c  reason: collision with root package name */
    private String f6543c;

    /* renamed from: d  reason: collision with root package name */
    private String f6544d;

    /* renamed from: e  reason: collision with root package name */
    private String f6545e;

    /* renamed from: f  reason: collision with root package name */
    private String f6546f;

    /* renamed from: g  reason: collision with root package name */
    private String f6547g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f6548h = new HashMap();

    public d(File file) {
        b(o.b(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
        if (r12 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
        if (r12.contains("BuildId:") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
        r12 = com.apm.insight.nativecrash.d.f6540m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a5, code lost:
        if (r12.find() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a8, code lost:
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ba, code lost:
        if (r0.equals("data") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bc, code lost:
        r11.f6548h.put(r1, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.io.File r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.d.b(java.io.File):void");
    }

    public String a() {
        return this.f6547g;
    }

    public void a(File file) {
        File b10 = o.b(file);
        if (b10.exists()) {
            b10.renameTo(new File(b10.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        b(o.b(file));
    }

    public Map<String, String> b() {
        return this.f6548h;
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f6545e;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f6546f;
        if (str2 != null) {
            sb2.append(str2);
        }
        String str3 = this.f6547g;
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }
}
