package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class g implements g.f {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.g f19692a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19693b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f19694c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19695d = false;

    public g(com.fyber.inneractive.sdk.measurement.g gVar) {
        this.f19692a = gVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.f19693b), String.valueOf(this.f19695d));
        if (this.f19692a != null) {
            int ordinal = bVar.ordinal();
            if (ordinal == 2) {
                this.f19695d = true;
            } else if (ordinal == 3) {
                if (this.f19695d) {
                    com.fyber.inneractive.sdk.measurement.g gVar = this.f19692a;
                    if (gVar.f17341c != null) {
                        IAlog.a("%s bufferStart", "OMVideo");
                        try {
                            gVar.f17341c.bufferStart();
                        } catch (Throwable th) {
                            gVar.a(th);
                        }
                    }
                    this.f19693b = true;
                }
            } else if (ordinal != 6) {
                if (ordinal == 7) {
                    com.fyber.inneractive.sdk.measurement.g gVar2 = this.f19692a;
                    if (gVar2.f17341c != null) {
                        IAlog.a("%s pause", "OMVideo");
                        try {
                            gVar2.f17341c.pause();
                        } catch (Throwable th2) {
                            gVar2.a(th2);
                        }
                    }
                    this.f19694c = true;
                } else if (ordinal != 8) {
                } else {
                    com.fyber.inneractive.sdk.measurement.g gVar3 = this.f19692a;
                    if (gVar3.f17341c != null) {
                        IAlog.a("%s complete", "OMVideo");
                        try {
                            gVar3.f17341c.complete();
                        } catch (Throwable th3) {
                            gVar3.a(th3);
                        }
                    }
                }
            } else if (this.f19693b) {
                this.f19693b = false;
                com.fyber.inneractive.sdk.measurement.g gVar4 = this.f19692a;
                if (gVar4.f17341c != null) {
                    IAlog.a("%s bufferEnd", "OMVideo");
                    try {
                        gVar4.f17341c.bufferFinish();
                    } catch (Throwable th4) {
                        gVar4.a(th4);
                    }
                }
            } else if (this.f19694c) {
                com.fyber.inneractive.sdk.measurement.g gVar5 = this.f19692a;
                if (gVar5.f17341c != null) {
                    IAlog.a("%s resume", "OMVideo");
                    try {
                        gVar5.f17341c.resume();
                    } catch (Throwable th5) {
                        gVar5.a(th5);
                    }
                }
                this.f19694c = false;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(Exception exc) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e(boolean z10) {
    }
}
