package com.bytedance.sdk.openadsdk.d;

import com.bytedance.sdk.component.d.c.c;
import com.bytedance.sdk.component.d.h;
import com.bytedance.sdk.component.d.r;
import com.bytedance.sdk.component.utils.l;

/* compiled from: StepTrackImpl.java */
/* loaded from: classes.dex */
public class b implements r {

    /* renamed from: a  reason: collision with root package name */
    private static int f13192a;

    /* renamed from: b  reason: collision with root package name */
    private long f13193b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f13194c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13195d;

    /* renamed from: e  reason: collision with root package name */
    private String f13196e;

    public b() {
        f13192a++;
        this.f13196e = "image_request_" + f13192a;
    }

    private String c(String str, h hVar) {
        com.bytedance.sdk.component.d.c.a o10;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1867169789:
                    if (str.equals("success")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1584526165:
                    if (str.equals("raw_cache")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1442758754:
                    if (str.equals("image_type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1428113824:
                    if (str.equals("disk_cache")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1335717394:
                    if (str.equals("decode")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1281977283:
                    if (str.equals("failed")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1076854124:
                    if (str.equals("check_duplicate")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1017400004:
                    if (str.equals("memory_cache")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1478448621:
                    if (str.equals("net_request")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1718821013:
                    if (str.equals("generate_key")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 2067979407:
                    if (str.equals("cache_policy")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return "success";
                case 1:
                    return "raw cache";
                case 2:
                    return "image type：";
                case 3:
                    return "disk cache";
                case 4:
                    return "decode";
                case 5:
                    if (!(hVar instanceof c) || (o10 = ((c) hVar).o()) == null) {
                        return "fail";
                    }
                    Throwable c11 = o10.c();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fail：code:");
                    sb2.append(o10.a());
                    sb2.append(", msg:");
                    sb2.append(o10.b());
                    sb2.append(", exception:");
                    sb2.append(c11 != null ? c11.getMessage() : "null \r\n");
                    return sb2.toString();
                case 6:
                    return "duplicate request";
                case 7:
                    return "memory cache";
                case '\b':
                    return "net request";
                case '\t':
                    return "generate key:" + hVar.e();
                case '\n':
                    return "cache policy";
            }
        }
        return str;
    }

    @Override // com.bytedance.sdk.component.d.r
    public void a(String str, h hVar) {
        if (!this.f13195d) {
            l.b("ImageLoaderStep", "start " + this.f13196e + " request:" + hVar.a() + ", width:" + hVar.b() + ",height:" + hVar.c());
            this.f13195d = true;
        }
        this.f13193b = System.currentTimeMillis();
        l.b("ImageLoaderStep", this.f13196e + " start:" + c(str, hVar));
    }

    @Override // com.bytedance.sdk.component.d.r
    public void b(String str, h hVar) {
        long currentTimeMillis = System.currentTimeMillis() - this.f13193b;
        this.f13194c += currentTimeMillis;
        l.b("ImageLoaderStep", this.f13196e + " end:" + c(str, hVar) + ",cost：" + currentTimeMillis + " ms， total：" + this.f13194c + "\r\n");
    }
}
