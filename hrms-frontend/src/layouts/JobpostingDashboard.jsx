import React from 'react'
import JobpostingDashboardBar from './jobpostingDashboardComponents/JobpostingDashboardBar'
import JobpostingDashboardTable from './jobpostingDashboardComponents/JobpostingDashboardTable'

export default function JobpostingDashboard() {
    return (
        <div>
            <JobpostingDashboardBar/>
            <JobpostingDashboardTable/>
        </div>
    )
}
