package com.vehiclecloud.app.videofetch.rndownloader.service.download;

import android.net.Uri;
import android.util.Log;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTask;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.media.HlsParser;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Helpers;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.StopRequestException;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import o9.g;
import o9.i;

/* loaded from: classes3.dex */
public class HlsDownload extends AbstractStreamingDownload {
    private static final byte BR = 10;
    private static final byte[] PLAYLIST_HEADER = "#EXTM3U".getBytes();
    private static final String TAG = "HlsDownload";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";

    private HlsDownload(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        super(downloadWorker, downloadResourceWithHeaders);
    }

    public static HlsDownload download(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        return new HlsDownload(downloadWorker, downloadResourceWithHeaders);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.AbstractStreamingDownload
    protected void fetchPlayList() {
        new DownloadConnection(null, this.resource.uri, this.headers, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.service.download.HlsDownload.1
            private void downloadKey(String str, String str2) {
                DownloadTask downloadTask = new DownloadTask();
                downloadTask.uri = str;
                downloadTask.fileName = str2;
                downloadTask.status = DownloadResource.STATUS_PENDING;
                DownloadConnection downloadConnection = new DownloadConnection(null, str, HlsDownload.this.headers, false);
                HlsDownload hlsDownload = HlsDownload.this;
                downloadConnection.withConnection(new FileDownloadListener<DownloadTask>(hlsDownload.worker, downloadTask, hlsDownload.headers) { // from class: com.vehiclecloud.app.videofetch.rndownloader.service.download.HlsDownload.1.1
                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener, com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public void onException(StopRequestException stopRequestException) throws StopRequestException {
                        super.onException(stopRequestException);
                        Log.e(FileDownloadListener.TAG, "downloadKey get ex:", stopRequestException);
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener, com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public void onFinished() throws StopRequestException {
                        super.onFinished();
                        Log.d(FileDownloadListener.TAG, "downloadKey finished");
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
                    protected void onProgress(long j10, long j11, long j12) {
                        Log.d(FileDownloadListener.TAG, "downloadKey oprogress:" + j10 + ";" + j11);
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
                    protected void updateTask() {
                    }
                });
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onException(StopRequestException stopRequestException) throws StopRequestException {
                Log.e(HlsDownload.TAG, "fetchPlayList get ex:", stopRequestException);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onFinished() {
                a.b(this);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onMovedPerm(String str) {
                a.c(this, str);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onOk(HttpURLConnection httpURLConnection) {
                if (Helpers.parseHeader(httpURLConnection, HlsDownload.this.resource)) {
                    HlsDownload hlsDownload = HlsDownload.this;
                    hlsDownload.resource.totalBytes = 0L;
                    hlsDownload.updateResource();
                }
                try {
                    i a10 = HlsParser.parser.a(Uri.parse(HlsDownload.this.resource.uri), httpURLConnection.getInputStream());
                    if (!(a10 instanceof g)) {
                        HlsDownload hlsDownload2 = HlsDownload.this;
                        hlsDownload2.resource.status = DownloadResource.STATUS_FILE_ERROR;
                        hlsDownload2.updateResource();
                        return;
                    }
                    g gVar = (g) a10;
                    HlsDownload hlsDownload3 = HlsDownload.this;
                    DownloadResourceDelta downloadResourceDelta = hlsDownload3.resource;
                    if (downloadResourceDelta.duration == 0) {
                        downloadResourceDelta.duration = (int) (gVar.f35086u / 1000000);
                    }
                    DownloaderHelper.pushHeadersMsg(hlsDownload3.worker, downloadResourceDelta);
                    URL url = new URL(gVar.f35131a);
                    String createAndGetBaseDir = HlsDownload.this.createAndGetBaseDir();
                    String relationDir = HlsDownload.this.getRelationDir(createAndGetBaseDir);
                    byte[] bytes = relationDir.getBytes();
                    ArrayList arrayList = new ArrayList(gVar.f35083r.size());
                    FileOutputStream fileOutputStream = new FileOutputStream(HlsDownload.this.resource.fileName);
                    fileOutputStream.write(HlsDownload.PLAYLIST_HEADER);
                    fileOutputStream.write(10);
                    int i10 = 0;
                    for (String str : gVar.f35132b) {
                        if (str.startsWith(HlsDownload.TAG_KEY)) {
                            int indexOf = str.indexOf("URI=");
                            if (indexOf != -1 && str.indexOf("data:", indexOf) <= 0) {
                                int i11 = indexOf + 5;
                                int indexOf2 = str.indexOf("\"", i11);
                                fileOutputStream.write((str.substring(0, i11) + relationDir + "key.key" + str.substring(indexOf2)).getBytes());
                                fileOutputStream.write(10);
                                String url2 = new URL(url, gVar.f35083r.get(0).f35101g).toString();
                                downloadKey(url2, createAndGetBaseDir + "/key.key");
                            }
                            fileOutputStream.write(str.getBytes());
                            fileOutputStream.write(10);
                        } else {
                            fileOutputStream.write(str.getBytes());
                            fileOutputStream.write(10);
                            if (str.startsWith(HlsDownload.TAG_MEDIA_DURATION)) {
                                URL url3 = new URL(url, gVar.f35083r.get(i10).f35095a);
                                DownloadTask downloadTask = new DownloadTask();
                                downloadTask.resourceId = HlsDownload.this.resource.f28600id;
                                downloadTask.uri = url3.toString();
                                String replace = url3.getPath().replace("/", "_");
                                downloadTask.fileName = createAndGetBaseDir + "/" + replace;
                                downloadTask.status = DownloadResource.STATUS_PENDING;
                                arrayList.add(downloadTask);
                                fileOutputStream.write(bytes);
                                fileOutputStream.write(replace.getBytes());
                                fileOutputStream.write(10);
                                i10++;
                            }
                        }
                    }
                    fileOutputStream.flush();
                    Helpers.closeQuietly(fileOutputStream);
                    HlsDownload.this.worker.mDownloadResourceDao.saveAllTasks(arrayList);
                    HlsDownload hlsDownload4 = HlsDownload.this;
                    hlsDownload4.segmentTasks = hlsDownload4.worker.mDownloadResourceDao.getAllTasksByResId(hlsDownload4.resource.f28600id);
                    HlsDownload.this.startTasks();
                } catch (IOException e10) {
                    Log.e(HlsDownload.TAG, "fetchPlayList get ex", e10);
                    HlsDownload hlsDownload5 = HlsDownload.this;
                    DownloadResourceDelta downloadResourceDelta2 = hlsDownload5.resource;
                    int i12 = downloadResourceDelta2.numFailed + 1;
                    downloadResourceDelta2.numFailed = i12;
                    if (i12 < 5) {
                        downloadResourceDelta2.status = DownloadResource.STATUS_WAITING_TO_RETRY;
                    } else {
                        downloadResourceDelta2.status = DownloadResource.STATUS_CANNOT_RESUME;
                    }
                    hlsDownload5.updateResource();
                }
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onPartial(HttpURLConnection httpURLConnection) {
                a.e(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onStart(HttpURLConnection httpURLConnection) {
                a.f(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onUnavailable(HttpURLConnection httpURLConnection) {
                a.g(this, httpURLConnection);
            }
        });
    }
}
