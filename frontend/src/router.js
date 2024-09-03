
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveFileManager from "./components/listers/DriveFileCards"
import DriveFileDetail from "./components/listers/DriveFileDetail"

import IndexerIndexManager from "./components/listers/IndexerIndexCards"
import IndexerIndexDetail from "./components/listers/IndexerIndexDetail"

import VideoProcessingVideoprocessingManager from "./components/listers/VideoProcessingVideoprocessingCards"
import VideoProcessingVideoprocessingDetail from "./components/listers/VideoProcessingVideoprocessingDetail"




export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/files',
                name: 'DriveFileManager',
                component: DriveFileManager
            },
            {
                path: '/drives/files/:id',
                name: 'DriveFileDetail',
                component: DriveFileDetail
            },

            {
                path: '/indexers/indices',
                name: 'IndexerIndexManager',
                component: IndexerIndexManager
            },
            {
                path: '/indexers/indices/:id',
                name: 'IndexerIndexDetail',
                component: IndexerIndexDetail
            },

            {
                path: '/videoProcessings/videoprocessings',
                name: 'VideoProcessingVideoprocessingManager',
                component: VideoProcessingVideoprocessingManager
            },
            {
                path: '/videoProcessings/videoprocessings/:id',
                name: 'VideoProcessingVideoprocessingDetail',
                component: VideoProcessingVideoprocessingDetail
            },





    ]
})
