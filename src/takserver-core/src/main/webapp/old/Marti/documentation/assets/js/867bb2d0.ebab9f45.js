"use strict";(self.webpackChunkdocusaurus_static=self.webpackChunkdocusaurus_static||[]).push([[5243],{3998:(t,n,e)=>{e.r(n),e.d(n,{assets:()=>u,contentTitle:()=>s,default:()=>d,frontMatter:()=>r,metadata:()=>a,toc:()=>c});var i=e(5893),o=e(1151);const r={},s="Group Assignment by Input",a={id:"configuration/groupassignmentbyinput",title:"Group Assignment by Input",description:"\\ can drive group filtering, even without authentication messages.  Version 1.3.0 added group filtering based on LDAP groups.  This necessitated a new authentication message from ATAK.  This worked for the streaming connections, but wouldn't work for the connection-less UDP traffic.",source:"@site/docs/configuration/groupassignmentbyinput.md",sourceDirName:"configuration",slug:"/configuration/groupassignmentbyinput",permalink:"/docs/configuration/groupassignmentbyinput",draft:!1,unlisted:!1,editUrl:"https://gitlab.com/octospacc/editocttrialTools/-/blob/main/docusaurus-static/docs/configuration/groupassignmentbyinput.md",tags:[],version:"current",frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Group Filtering",permalink:"/docs/configuration/groupfiltering"},next:{title:"Group Assignment Using Authentication Messages",permalink:"/docs/configuration/groupassignmentusingauth"}},u={},c=[{value:"Input Configuration UI",id:"input-configuration-ui",level:2}];function p(t){const n={code:"code",em:"em",h1:"h1",h2:"h2",p:"p",pre:"pre",strong:"strong",...(0,o.a)(),...t.components};return(0,i.jsxs)(i.Fragment,{children:[(0,i.jsx)(n.h1,{id:"group-assignment-by-input",children:"Group Assignment by Input"}),"\n",(0,i.jsx)(n.p,{children:"<inputs> can drive group filtering, even without authentication messages.  Version 1.3.0 added group filtering based on LDAP groups.  This necessitated a new authentication message from ATAK.  This worked for the streaming connections, but wouldn't work for the connection-less UDP traffic."}),"\n",(0,i.jsx)(n.p,{children:"We added an additional configuration option for inputs to allow the connection-less traffic to be routed according to the group filtering.  An input definition like this:"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:'   <input _name="stdudp" protocol="udp" port="8087">\n     <filtergroup>TEST1</filtergroup>\n   </input>\n\n'})}),"\n",(0,i.jsx)(n.p,{children:"would have the effect of making every CoT event that came into the 'stdudp' input be associated with the \u201cTEST1\u201d group instead of the anonymous group.  If there is no filtergroup specified, the default is the old behavior, which is a special anonymous group.  The anonymous group has a name \u201c__ANON__\u201d that can be used to explicitly add it back in if needed.  The filtergroup option can be used with the streaming input protocols as well (stcp, tls), the effect of which is that any subscriptions made by connecting to that port inherit the filter group from the input.  <filtergroup> cannot be used in conjunction with the \u201cauth\u201d attribute on the same input.  You can however use them on separate inputs, for example:"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:'   <input _name="stdudp" protocol="udp" port="8087">\n     <filtergroup>CN=TAK1,DC=...</filtergroup>\n   </input>\n   <input _name="sec" protocol="tls" port="8089" auth="ldap" />\n'})}),"\n",(0,i.jsx)(n.p,{children:(0,i.jsx)(n.em,{children:"Note that when trying to interact with LDAP groups, you need to use the fully qualified group name that LDAP/ActiveDirectory reports."})}),"\n",(0,i.jsx)(n.h2,{id:"input-configuration-ui",children:"Input Configuration UI"}),"\n",(0,i.jsxs)(n.p,{children:["Inputs can be dynamically added, modified and deleted in the TAK Server user interface, under the menu heading ",(0,i.jsx)(n.strong,{children:"Configuration \u2192 Input Definitions"}),".  The UI also shows activity for each input, in terms of number of reads and messages.  For the streaming protocols (stcp, tls), the activity is the sum for all connections made using that particular input port."]})]})}function d(t={}){const{wrapper:n}={...(0,o.a)(),...t.components};return n?(0,i.jsx)(n,{...t,children:(0,i.jsx)(p,{...t})}):p(t)}},1151:(t,n,e)=>{e.d(n,{Z:()=>a,a:()=>s});var i=e(7294);const o={},r=i.createContext(o);function s(t){const n=i.useContext(r);return i.useMemo((function(){return"function"==typeof t?t(n):{...n,...t}}),[n,t])}function a(t){let n;return n=t.disableParentContext?"function"==typeof t.components?t.components(o):t.components||o:s(t.components),i.createElement(r.Provider,{value:n},t.children)}}}]);