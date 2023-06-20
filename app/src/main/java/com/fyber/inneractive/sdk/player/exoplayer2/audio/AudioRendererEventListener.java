package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.i;

/* loaded from: classes.dex */
public interface AudioRendererEventListener {

    /* loaded from: classes.dex */
    public static final class EventDispatcher {
        private final Handler handler;
        private final AudioRendererEventListener listener;

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DecoderCounters f17978a;

            public a(DecoderCounters decoderCounters) {
                this.f17978a = decoderCounters;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioEnabled(this.f17978a);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f17980a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ long f17981b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ long f17982c;

            public b(String str, long j10, long j11) {
                this.f17980a = str;
                this.f17981b = j10;
                this.f17982c = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioDecoderInitialized(this.f17980a, this.f17981b, this.f17982c);
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i f17984a;

            public c(i iVar) {
                this.f17984a = iVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioInputFormatChanged(this.f17984a);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f17986a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ long f17987b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ long f17988c;

            public d(int i10, long j10, long j11) {
                this.f17986a = i10;
                this.f17987b = j10;
                this.f17988c = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioTrackUnderrun(this.f17986a, this.f17987b, this.f17988c);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DecoderCounters f17990a;

            public e(DecoderCounters decoderCounters) {
                this.f17990a = decoderCounters;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17990a.ensureUpdated();
                EventDispatcher.this.listener.onAudioDisabled(this.f17990a);
            }
        }

        /* loaded from: classes.dex */
        public class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f17992a;

            public f(int i10) {
                this.f17992a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioSessionId(this.f17992a);
            }
        }

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(handler) : null;
            this.listener = audioRendererEventListener;
        }

        public void audioSessionId(int i10) {
            if (this.listener != null) {
                this.handler.post(new f(i10));
            }
        }

        public void audioTrackUnderrun(int i10, long j10, long j11) {
            if (this.listener != null) {
                this.handler.post(new d(i10, j10, j11));
            }
        }

        public void decoderInitialized(String str, long j10, long j11) {
            if (this.listener != null) {
                this.handler.post(new b(str, j10, j11));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new e(decoderCounters));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new a(decoderCounters));
            }
        }

        public void inputFormatChanged(i iVar) {
            if (this.listener != null) {
                this.handler.post(new c(iVar));
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(i iVar);

    void onAudioSessionId(int i10);

    void onAudioTrackUnderrun(int i10, long j10, long j11);
}
