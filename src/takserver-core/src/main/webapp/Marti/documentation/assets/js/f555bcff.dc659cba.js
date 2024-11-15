"use strict";(self.webpackChunkdocusaurus_static=self.webpackChunkdocusaurus_static||[]).push([[8654],{3640:(t,e,r)=>{r.r(e),r.d(e,{assets:()=>u,contentTitle:()=>a,default:()=>p,frontMatter:()=>n,metadata:()=>s,toc:()=>c});var o=r(5893),i=r(1151);const n={},a="Group Filtering for Multicast Networks",s={id:"groupfilteringformulticast",title:"Group Filtering for Multicast Networks",description:"The proxy attribute on the CoreConfig input element ( \\ ) was removed in TAK Server 4.1. The intent of the proxy attribute was to control bridging of multicast networks and federating multicast data. As TAK Server\u2019s group filtering capabilities have evolved, having a dedicated proxy attribute is no longer needed. Using filtergroup on the mcast input you can achieve greater control over multicast traffic.",source:"@site/docs/groupfilteringformulticast.md",sourceDirName:".",slug:"/groupfilteringformulticast",permalink:"/docs/groupfilteringformulticast",draft:!1,unlisted:!1,editUrl:"https://gitlab.com/octospacc/editocttrialTools/-/blob/main/docusaurus-static/docs/groupfilteringformulticast.md",tags:[],version:"current",frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Logging",permalink:"/docs/logging"},next:{title:"OAuth2 Authentication",permalink:"/docs/oath2authentication"}},u={},c=[];function l(t){const e={code:"code",h1:"h1",p:"p",pre:"pre",...(0,i.a)(),...t.components};return(0,o.jsxs)(o.Fragment,{children:[(0,o.jsx)(e.h1,{id:"group-filtering-for-multicast-networks",children:"Group Filtering for Multicast Networks"}),"\n",(0,o.jsx)(e.p,{children:'The proxy attribute on the CoreConfig input element ( <input \u2026 proxy="true" \u2026 /> ) was removed in TAK Server 4.1. The intent of the proxy attribute was to control bridging of multicast networks and federating multicast data. As TAK Server\u2019s group filtering capabilities have evolved, having a dedicated proxy attribute is no longer needed. Using filtergroup on the mcast input you can achieve greater control over multicast traffic.\nThe default behavior in TAK Server 4.1 and higher is to put multicast traffic in the __ANON__ group. You can use a filtergroup on the mcast input to put your mcast traffic into a dedicated multicast group, for example:'}),"\n",(0,o.jsx)(e.pre,{children:(0,o.jsx)(e.code,{className:"language-bash",children:'<input auth="anonymous" _name=" SAproxy " protocol="mcast" port="6969" group="239.2.3.1">\n  <filtergroup>__MCAST__</filtergroup>\n</input>\n'})}),"\n",(0,o.jsx)(e.p,{children:"Then add the __MCAST__ group as a filtergroup on any other inputs you wanted to share multicast traffic with. For example, to share multicast traffic with the tls/8089, configure your input filtergroups as follows:"}),"\n",(0,o.jsx)(e.pre,{children:(0,o.jsx)(e.code,{className:"language-bash",children:'<input auth="anonymous" _name="stdssl1" protocol="tls" port="8089" archive="true">\n  <filtergroup>__ANON__</filtergroup>\n  <filtergroup>__MCAST__</filtergroup>\n</input>\n'})}),"\n",(0,o.jsx)(e.p,{children:"This same approach works for federations. You can __MCAST__ as an outboundGroup on any federates that you wanted to share multicast traffic with. Using the filtergroup approach allows for creation of input specific multicast groups, allowing control of how messages from multicast networks are routed."})]})}function p(t={}){const{wrapper:e}={...(0,i.a)(),...t.components};return e?(0,o.jsx)(e,{...t,children:(0,o.jsx)(l,{...t})}):l(t)}},1151:(t,e,r)=>{r.d(e,{Z:()=>s,a:()=>a});var o=r(7294);const i={},n=o.createContext(i);function a(t){const e=o.useContext(n);return o.useMemo((function(){return"function"==typeof t?t(e):{...e,...t}}),[e,t])}function s(t){let e;return e=t.disableParentContext?"function"==typeof t.components?t.components(i):t.components||i:a(t.components),o.createElement(n.Provider,{value:e},t.children)}}}]);