"use client";
import React from 'react';
import {Header, LeftSidebar, RightSidebar, SearchBar} from "@/components";

const BoardLayout = ({ children }) => {
  return (
    <div>
      <Header/>
      <div className="z-10 min-h-screen flex space-x-4">
        <LeftSidebar />
        <div className="h-screen flex flex-col flex-1 p-4 ">
          {/* 상단 검색 바 고정 */}
          <div className="sticky top-0 z-10">
            <SearchBar />
          </div>

          {/* 내용물(children) 목록 스크롤 가능 영역 */}
          <div className="overflow-y-auto p-4 space-y-4 flex-grow">
            {children}
          </div>
        </div>
        <RightSidebar />
      </div>
    </div>
  );
};

export default BoardLayout;