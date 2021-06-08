import React from 'react'
import JobpostingDashboardBar from './dashboardComponents/JobpostingDashboardBar'
import JobpostingDashboardTable from './dashboardComponents/JobpostingDashboardTable'

export default function JobpostingDashboard() {
    return (
        <div>
            <JobpostingDashboardBar/>
            <JobpostingDashboardTable/>
        </div>
    )
}
