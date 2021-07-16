
const mybook = {
    title: '1984',
    author: 'George Orwell',
    pageCount: 324
    
    }

    const ontherBook ={
    
        title: 'A people History',
        author: 'Howard Zinn',
        pageCount: 20
        
    }

    const getSummary =(book)=>{
        return{
        
        summary : `${book.title} by ${book.author}`,
        PageSummary: `${book.title} by ${book.pageCount} pages`,
        }

     
    }

    
   const bookSummary = getSummary(mybook)
    const otherBookSummary = getSummary(ontherBook)

    console.log(bookSummary)

    //challenge


    const fahrenheit =(f)=>{
    return {
        fra: f,
        kevin: (f + 459.67)*(5/9),
        celsius: (f -32)*(5/9)
    }
    }

    const temp = fahrenheit(20)

    console.log(temp)