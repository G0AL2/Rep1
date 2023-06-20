package com.bytedance.mobsec.metasec.ov;

import java.util.Map;
import ms.bd.o.Pgl.l0;

/* loaded from: classes.dex */
public final class PglMSManager implements l0.pgla {

    /* renamed from: a  reason: collision with root package name */
    private final l0.pgla f9204a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PglMSManager(l0.pgla pglaVar) {
        this.f9204a = pglaVar;
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> frameSign(String str, int i10) {
        return this.f9204a.frameSign(str, i10);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        return this.f9204a.getFeatureHash(str, bArr);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> getReportRaw(String str, int i10, Map<String, String> map) {
        return this.f9204a.getReportRaw(str, i10, map);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public String getToken() {
        return this.f9204a.getToken();
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void report(String str) {
        this.f9204a.report(str);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setBDDeviceID(String str) {
        this.f9204a.setBDDeviceID(str);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setCollectMode(int i10) {
        this.f9204a.setCollectMode(i10);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setDeviceID(String str) {
        this.f9204a.setDeviceID(str);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setInstallID(String str) {
        this.f9204a.setInstallID(str);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setSessionID(String str) {
        this.f9204a.setSessionID(str);
    }
}
