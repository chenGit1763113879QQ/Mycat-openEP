// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `goods.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.goods.stock;

public interface _GoodsStorageManageHandlerOperationsNC
{
    StorageAmount queryGoodsAmount(StorageQuery query);

    StorageChangeResult changeStorage(StorageChange change);

    StorageChangeResult changeStorageBatch(StorageChange[] change);
}
