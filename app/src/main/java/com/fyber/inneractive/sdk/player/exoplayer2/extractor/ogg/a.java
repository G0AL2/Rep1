package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final e f18705a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final long f18706b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18707c;

    /* renamed from: d  reason: collision with root package name */
    public final h f18708d;

    /* renamed from: e  reason: collision with root package name */
    public int f18709e;

    /* renamed from: f  reason: collision with root package name */
    public long f18710f;

    /* renamed from: g  reason: collision with root package name */
    public long f18711g;

    /* renamed from: h  reason: collision with root package name */
    public long f18712h;

    /* renamed from: i  reason: collision with root package name */
    public long f18713i;

    /* renamed from: j  reason: collision with root package name */
    public long f18714j;

    /* renamed from: k  reason: collision with root package name */
    public long f18715k;

    /* renamed from: l  reason: collision with root package name */
    public long f18716l;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0255a implements m {
        public C0255a() {
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long a(long j10) {
            if (j10 == 0) {
                return a.this.f18706b;
            }
            a aVar = a.this;
            long j11 = aVar.f18706b;
            long j12 = aVar.f18707c;
            long j13 = (((((aVar.f18708d.f18750i * j10) / 1000000) * (j12 - j11)) / aVar.f18710f) - 30000) + j11;
            if (j13 >= j11) {
                j11 = j13;
            }
            return j11 >= j12 ? j12 - 1 : j11;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public boolean a() {
            return true;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long c() {
            a aVar = a.this;
            return (aVar.f18710f * 1000000) / aVar.f18708d.f18750i;
        }
    }

    public a(long j10, long j11, h hVar, int i10, long j12) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(j10 >= 0 && j11 > j10);
        this.f18708d = hVar;
        this.f18706b = j10;
        this.f18707c = j11;
        if (i10 == j11 - j10) {
            this.f18710f = j12;
            this.f18709e = 3;
            return;
        }
        this.f18709e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        e eVar;
        long j10;
        long min;
        int i10 = this.f18709e;
        if (i10 == 0) {
            long j11 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).f18144c;
            this.f18711g = j11;
            this.f18709e = 1;
            long j12 = this.f18707c - 65307;
            if (j12 > j11) {
                return j12;
            }
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j13 = this.f18712h;
            long j14 = 0;
            if (j13 != 0) {
                long j15 = this.f18713i;
                long j16 = this.f18714j;
                if (j15 == j16) {
                    min = -(this.f18715k + 2);
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
                    long j17 = bVar.f18144c;
                    if (!a(gVar, j16)) {
                        min = this.f18713i;
                        if (min == j17) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        this.f18705a.a(gVar, false);
                        bVar.f18146e = 0;
                        e eVar2 = this.f18705a;
                        long j18 = eVar2.f18733b;
                        long j19 = j13 - j18;
                        int i11 = eVar2.f18735d + eVar2.f18736e;
                        int i12 = (j19 > 0L ? 1 : (j19 == 0L ? 0 : -1));
                        if (i12 >= 0 && j19 <= 72000) {
                            bVar.c(i11);
                            j10 = this.f18705a.f18733b;
                        } else {
                            if (i12 < 0) {
                                this.f18714j = j17;
                                this.f18716l = j18;
                            } else {
                                long j20 = i11;
                                long j21 = bVar.f18144c + j20;
                                this.f18713i = j21;
                                this.f18715k = j18;
                                if ((this.f18714j - j21) + j20 < 100000) {
                                    bVar.c(i11);
                                    j10 = this.f18715k;
                                }
                            }
                            long j22 = this.f18714j;
                            long j23 = this.f18713i;
                            long j24 = j22 - j23;
                            if (j24 < 100000) {
                                this.f18714j = j23;
                                min = j23;
                            } else {
                                min = Math.min(Math.max((bVar.f18144c - (i11 * (i12 <= 0 ? 2 : 1))) + ((j19 * j24) / (this.f18716l - this.f18715k)), j23), this.f18714j - 1);
                            }
                        }
                        min = -(j10 + 2);
                    }
                }
                if (min >= 0) {
                    return min;
                }
                long j25 = this.f18712h;
                this.f18705a.a(gVar, false);
                j14 = -(min + 2);
                while (true) {
                    e eVar3 = this.f18705a;
                    if (eVar3.f18733b >= j25) {
                        break;
                    }
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c(eVar3.f18735d + eVar3.f18736e);
                    e eVar4 = this.f18705a;
                    j14 = eVar4.f18733b;
                    eVar4.a(gVar, false);
                }
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).f18146e = 0;
            }
            this.f18709e = 3;
            return -(j14 + 2);
        }
        if (a(gVar, this.f18707c)) {
            this.f18705a.a();
            while (true) {
                eVar = this.f18705a;
                if ((eVar.f18732a & 4) == 4) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
                if (bVar2.f18144c >= this.f18707c) {
                    break;
                }
                eVar.a(gVar, false);
                e eVar5 = this.f18705a;
                bVar2.c(eVar5.f18735d + eVar5.f18736e);
            }
            this.f18710f = eVar.f18733b;
            this.f18709e = 3;
            return this.f18711g;
        }
        throw new EOFException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
    public m b() {
        if (this.f18710f != 0) {
            return new C0255a();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
    public long c(long j10) {
        int i10 = this.f18709e;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i10 == 3 || i10 == 2);
        long j11 = j10 == 0 ? 0L : (this.f18708d.f18750i * j10) / 1000000;
        this.f18712h = j11;
        this.f18709e = 2;
        this.f18713i = this.f18706b;
        this.f18714j = this.f18707c;
        this.f18715k = 0L;
        this.f18716l = this.f18710f;
        return j11;
    }

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, long j10) throws IOException, InterruptedException {
        int i10;
        long min = Math.min(j10 + 3, this.f18707c);
        int i11 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
            long j11 = bVar.f18144c;
            int i12 = 0;
            if (i11 + j11 > min && (i11 = (int) (min - j11)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i11, false);
            while (true) {
                i10 = i11 - 3;
                if (i12 < i10) {
                    if (bArr[i12] == 79 && bArr[i12 + 1] == 103 && bArr[i12 + 2] == 103 && bArr[i12 + 3] == 83) {
                        bVar.c(i12);
                        return true;
                    }
                    i12++;
                }
            }
            bVar.c(i10);
        }
    }
}
