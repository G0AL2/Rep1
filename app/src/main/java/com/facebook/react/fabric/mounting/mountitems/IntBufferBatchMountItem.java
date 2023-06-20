package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.m0;
import g6.a;
import l6.c;
import m6.d;

@a
/* loaded from: classes.dex */
public class IntBufferBatchMountItem implements d {

    /* renamed from: g  reason: collision with root package name */
    static final String f15389g = "IntBufferBatchMountItem";

    /* renamed from: a  reason: collision with root package name */
    private final int f15390a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15391b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f15392c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f15393d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15394e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15395f;

    public IntBufferBatchMountItem(int i10, int[] iArr, Object[] objArr, int i11) {
        this.f15390a = i10;
        this.f15391b = i11;
        this.f15392c = iArr;
        this.f15393d = objArr;
        this.f15394e = iArr != null ? iArr.length : 0;
        this.f15395f = objArr != null ? objArr.length : 0;
    }

    private void c(String str) {
        com.facebook.systrace.a.c(0L, "FabricUIManager::" + str + " - " + this.f15394e + " intBufSize  - " + this.f15395f + " objBufSize");
        int i10 = this.f15391b;
        if (i10 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i10);
        }
    }

    private static EventEmitterWrapper d(Object obj) {
        if (obj != null) {
            return (EventEmitterWrapper) obj;
        }
        return null;
    }

    private static ReadableMap e(Object obj) {
        if (obj != null) {
            return (ReadableMap) obj;
        }
        return null;
    }

    private static m0 f(Object obj) {
        if (obj != null) {
            return (m0) obj;
        }
        return null;
    }

    private void g() {
        int i10 = this.f15391b;
        if (i10 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i10);
        }
        com.facebook.systrace.a.g(0L);
    }

    @Override // m6.d
    public int a() {
        return this.f15390a;
    }

    @Override // m6.d
    public void b(c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        l6.d d10 = cVar.d(this.f15390a);
        if (d10 == null) {
            z3.a.l(f15389g, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.f15390a));
        } else if (d10.C()) {
            z3.a.l(f15389g, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.f15390a));
        } else {
            if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                z3.a.c(f15389g, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.f15390a));
            }
            c("mountViews");
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.f15394e) {
                int[] iArr = this.f15392c;
                int i18 = i16 + 1;
                int i19 = iArr[i16];
                int i20 = i19 & (-2);
                if ((i19 & 1) != 0) {
                    int i21 = iArr[i18];
                    i18++;
                    i10 = i21;
                } else {
                    i10 = 1;
                }
                int i22 = i17;
                i16 = i18;
                for (int i23 = 0; i23 < i10; i23++) {
                    if (i20 == 2) {
                        int i24 = i22 + 1;
                        String a10 = com.facebook.react.fabric.a.a((String) this.f15393d[i22]);
                        int i25 = i16 + 1;
                        int i26 = this.f15392c[i16];
                        int i27 = i24 + 1;
                        ReadableMap e10 = e(this.f15393d[i24]);
                        int i28 = i27 + 1;
                        i22 = i28 + 1;
                        i14 = i25 + 1;
                        d10.o(a10, i26, e10, f(this.f15393d[i27]), d(this.f15393d[i28]), this.f15392c[i25] == 1);
                    } else {
                        if (i20 == 4) {
                            d10.q(this.f15392c[i16]);
                            i16++;
                        } else {
                            if (i20 == 8) {
                                int[] iArr2 = this.f15392c;
                                int i29 = i16 + 1;
                                int i30 = i29 + 1;
                                i15 = i30 + 1;
                                d10.m(iArr2[i29], iArr2[i16], iArr2[i30]);
                            } else if (i20 == 16) {
                                int[] iArr3 = this.f15392c;
                                int i31 = i16 + 1;
                                int i32 = i31 + 1;
                                i15 = i32 + 1;
                                d10.J(iArr3[i16], iArr3[i31], iArr3[i32]);
                            } else {
                                if (i20 == 32) {
                                    i11 = i16 + 1;
                                    i12 = i22 + 1;
                                    d10.R(this.f15392c[i16], e(this.f15393d[i22]));
                                } else if (i20 == 64) {
                                    i11 = i16 + 1;
                                    i12 = i22 + 1;
                                    d10.S(this.f15392c[i16], f(this.f15393d[i22]));
                                } else if (i20 == 128) {
                                    int[] iArr4 = this.f15392c;
                                    int i33 = i16 + 1;
                                    int i34 = iArr4[i16];
                                    int i35 = i33 + 1;
                                    int i36 = iArr4[i33];
                                    int i37 = i35 + 1;
                                    int i38 = iArr4[i35];
                                    int i39 = i37 + 1;
                                    int i40 = i39 + 1;
                                    i14 = i40 + 1;
                                    d10.O(i34, i36, i38, iArr4[i37], iArr4[i39], iArr4[i40]);
                                } else {
                                    if (i20 == 512) {
                                        int[] iArr5 = this.f15392c;
                                        int i41 = i16 + 1;
                                        int i42 = iArr5[i16];
                                        int i43 = i41 + 1;
                                        int i44 = iArr5[i41];
                                        int i45 = i43 + 1;
                                        int i46 = iArr5[i43];
                                        int i47 = i45 + 1;
                                        i13 = i47 + 1;
                                        d10.Q(i42, i44, i46, iArr5[i45], iArr5[i47]);
                                    } else if (i20 == 1024) {
                                        int[] iArr6 = this.f15392c;
                                        int i48 = i16 + 1;
                                        int i49 = iArr6[i16];
                                        int i50 = i48 + 1;
                                        int i51 = iArr6[i48];
                                        int i52 = i50 + 1;
                                        int i53 = iArr6[i50];
                                        int i54 = i52 + 1;
                                        i13 = i54 + 1;
                                        d10.P(i49, i51, i53, iArr6[i52], iArr6[i54]);
                                    } else if (i20 == 256) {
                                        i11 = i16 + 1;
                                        i12 = i22 + 1;
                                        d10.N(this.f15392c[i16], d(this.f15393d[i22]));
                                    } else {
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i20 + " at index: " + i16);
                                    }
                                    i16 = i13;
                                }
                                i16 = i11;
                                i22 = i12;
                            }
                            i16 = i15;
                        }
                    }
                    i16 = i14;
                }
                i17 = i22;
            }
            g();
        }
    }

    public boolean h() {
        return this.f15394e != 0;
    }

    public String toString() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", Integer.valueOf(this.f15390a)));
            int i15 = 0;
            int i16 = 0;
            while (i15 < this.f15394e) {
                int[] iArr = this.f15392c;
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                int i19 = i18 & (-2);
                if ((i18 & 1) != 0) {
                    i10 = iArr[i17];
                    i17++;
                } else {
                    i10 = 1;
                }
                i15 = i17;
                for (int i20 = 0; i20 < i10; i20++) {
                    if (i19 == 2) {
                        int i21 = i15 + 1;
                        i14 = i21 + 1;
                        sb2.append(String.format("CREATE [%d] - layoutable:%d - %s\n", Integer.valueOf(this.f15392c[i15]), Integer.valueOf(this.f15392c[i21]), com.facebook.react.fabric.a.a((String) this.f15393d[i16])));
                        i16 = i16 + 1 + 3;
                    } else {
                        if (i19 == 4) {
                            i11 = i15 + 1;
                            sb2.append(String.format("DELETE [%d]\n", Integer.valueOf(this.f15392c[i15])));
                        } else if (i19 == 8) {
                            int i22 = i15 + 1;
                            int i23 = i22 + 1;
                            i14 = i23 + 1;
                            sb2.append(String.format("INSERT [%d]->[%d] @%d\n", Integer.valueOf(this.f15392c[i15]), Integer.valueOf(this.f15392c[i22]), Integer.valueOf(this.f15392c[i23])));
                        } else if (i19 == 16) {
                            int i24 = i15 + 1;
                            int i25 = i24 + 1;
                            i14 = i25 + 1;
                            sb2.append(String.format("REMOVE [%d]->[%d] @%d\n", Integer.valueOf(this.f15392c[i15]), Integer.valueOf(this.f15392c[i24]), Integer.valueOf(this.f15392c[i25])));
                        } else {
                            if (i19 == 32) {
                                i13 = i16 + 1;
                                e(this.f15393d[i16]);
                                i11 = i15 + 1;
                                sb2.append(String.format("UPDATE PROPS [%d]: %s\n", Integer.valueOf(this.f15392c[i15]), "<hidden>"));
                            } else if (i19 == 64) {
                                i13 = i16 + 1;
                                f(this.f15393d[i16]);
                                i11 = i15 + 1;
                                sb2.append(String.format("UPDATE STATE [%d]: %s\n", Integer.valueOf(this.f15392c[i15]), "<hidden>"));
                            } else {
                                if (i19 == 128) {
                                    int i26 = i15 + 1;
                                    int i27 = i26 + 1;
                                    int i28 = i27 + 1;
                                    int i29 = i28 + 1;
                                    int i30 = i29 + 1;
                                    sb2.append(String.format("UPDATE LAYOUT [%d]: x:%d y:%d w:%d h:%d displayType:%d\n", Integer.valueOf(this.f15392c[i15]), Integer.valueOf(this.f15392c[i26]), Integer.valueOf(this.f15392c[i27]), Integer.valueOf(this.f15392c[i28]), Integer.valueOf(this.f15392c[i29]), Integer.valueOf(this.f15392c[i30])));
                                    i15 = i30 + 1;
                                } else {
                                    if (i19 == 512) {
                                        int i31 = i15 + 1;
                                        int i32 = i31 + 1;
                                        int i33 = i32 + 1;
                                        int i34 = i33 + 1;
                                        i12 = i34 + 1;
                                        sb2.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", Integer.valueOf(this.f15392c[i15]), Integer.valueOf(this.f15392c[i31]), Integer.valueOf(this.f15392c[i32]), Integer.valueOf(this.f15392c[i33]), Integer.valueOf(this.f15392c[i34])));
                                    } else if (i19 == 1024) {
                                        int i35 = i15 + 1;
                                        int i36 = i35 + 1;
                                        int i37 = i36 + 1;
                                        int i38 = i37 + 1;
                                        i12 = i38 + 1;
                                        sb2.append(String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", Integer.valueOf(this.f15392c[i15]), Integer.valueOf(this.f15392c[i35]), Integer.valueOf(this.f15392c[i36]), Integer.valueOf(this.f15392c[i37]), Integer.valueOf(this.f15392c[i38])));
                                    } else if (i19 != 256) {
                                        String str = f15389g;
                                        z3.a.j(str, "String so far: " + sb2.toString());
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i19 + " at index: " + i15);
                                    } else {
                                        i16++;
                                        i11 = i15 + 1;
                                        sb2.append(String.format("UPDATE EVENTEMITTER [%d]\n", Integer.valueOf(this.f15392c[i15])));
                                    }
                                    i15 = i12;
                                }
                            }
                            i16 = i13;
                        }
                        i15 = i11;
                    }
                    i15 = i14;
                }
            }
            return sb2.toString();
        } catch (Exception e10) {
            z3.a.k(f15389g, "Caught exception trying to print", e10);
            StringBuilder sb3 = new StringBuilder();
            for (int i39 = 0; i39 < this.f15394e; i39++) {
                sb3.append(this.f15392c[i39]);
                sb3.append(", ");
            }
            z3.a.j(f15389g, sb3.toString());
            for (int i40 = 0; i40 < this.f15395f; i40++) {
                String str2 = f15389g;
                Object[] objArr = this.f15393d;
                z3.a.j(str2, objArr[i40] != null ? objArr[i40].toString() : "null");
            }
            return "";
        }
    }
}
